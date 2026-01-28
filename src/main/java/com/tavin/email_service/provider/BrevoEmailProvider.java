package com.tavin.email_service.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

@Component
public class BrevoEmailProvider implements EmailProvider {

    private final WebClient webClient;

    @Value("${brevo.api.key}")
    private String apiKey;

    @Value("${brevo.sender.email}")
    private String senderEmail;

    @Value("${brevo.sender.name}")
    private String senderName;

    public BrevoEmailProvider() {
        this.webClient = WebClient.builder()
                .baseUrl("https://api.brevo.com")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    @Override
    public void sendEmail(String to, String subject, String body) {

        Map<String, Object> payload = Map.of(
                "sender", Map.of(
                        "name", senderName,
                        "email", senderEmail
                ),
                "to", new Object[]{
                        Map.of("email", to)
                },
                "subject", subject,
                "htmlContent", "<p>" + body + "</p>"
        );

        webClient.post()
                .uri("/v3/smtp/email")
                .header("api-key", apiKey)
                .bodyValue(payload)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        System.out.println("📧 Email REAL enviado via Brevo!");
    }

    @Override
    public String getName() {
        return "BREVO";
    }
}

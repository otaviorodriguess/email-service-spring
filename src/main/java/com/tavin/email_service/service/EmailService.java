package com.tavin.email_service.service;

import com.tavin.email_service.provider.EmailProvider;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final EmailProvider emailProvider;

    public EmailService(EmailProvider emailProvider) {
        this.emailProvider = emailProvider;
    }

    public void send(String to, String subject, String body) {
        emailProvider.sendEmail(to, subject, body);
    }
}

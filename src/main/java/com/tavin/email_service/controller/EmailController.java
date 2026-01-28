package com.tavin.email_service.controller;

import com.tavin.email_service.dto.EmailRequest;
import com.tavin.email_service.service.EmailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(
            @RequestBody EmailRequest request
    ) {
        emailService.send(
                request.getTo(),
                request.getSubject(),
                request.getBody()
        );

        return ResponseEntity.ok("Email enviado com sucesso!");
    }
}

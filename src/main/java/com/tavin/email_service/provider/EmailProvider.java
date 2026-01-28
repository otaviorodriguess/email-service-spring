package com.tavin.email_service.provider;

public interface EmailProvider {

    void sendEmail(String to, String subject, String body);

    String getName();
}


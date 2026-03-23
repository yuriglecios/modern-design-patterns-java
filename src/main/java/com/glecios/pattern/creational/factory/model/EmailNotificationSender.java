package com.glecios.pattern.creational.factory.model;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service("email")
public final class EmailNotificationSender implements INotificationSender {

    @Override
    public NotificationResult send(String recipient, String message) {
        return new NotificationResult(
            NotificationType.EMAIL,
            recipient,
            message,
            "SENT",
            LocalDateTime.now()
        );
    }

}

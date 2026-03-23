package com.glecios.pattern.creational.factory.model;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service("sms")
public final class SMSNotificationSender implements INotificationSender {

    @Override
    public NotificationResult send(String recipient, String message) {
        return new NotificationResult(
            NotificationType.SMS,
            recipient,
            message,
            "SENT",
            LocalDateTime.now()
        );
    }

}

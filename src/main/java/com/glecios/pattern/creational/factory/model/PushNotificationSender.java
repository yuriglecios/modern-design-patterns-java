package com.glecios.pattern.creational.factory.model;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service("push")
public final class PushNotificationSender implements INotificationSender {

    @Override
    public NotificationResult send(String recipient, String message) {
        return new NotificationResult(
            NotificationType.PUSH,
            recipient,
            message,
            "SENT",
            LocalDateTime.now()
        );
    }

}

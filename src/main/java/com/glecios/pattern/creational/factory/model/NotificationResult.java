package com.glecios.pattern.creational.factory.model;

import java.time.LocalDateTime;

public record NotificationResult(
    NotificationType type,
    String recipient,
    String message,
    String status,
    LocalDateTime sentAt
) {
}

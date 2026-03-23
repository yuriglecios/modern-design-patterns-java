package com.glecios.pattern.creational.factory.creator;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.glecios.pattern.creational.factory.model.INotificationSender;
import com.glecios.pattern.creational.factory.model.NotificationResult;
import com.glecios.pattern.creational.factory.model.NotificationType;

@Component
public class NotificationFactory {
    private final Map<String, INotificationSender> senders;

    public NotificationFactory(Map<String, INotificationSender> senders) {
        this.senders = senders;
    }

    public NotificationResult send(NotificationType type, String recipient, String message){
        var sender = this.senders.get(type.getBeanName());
        return switch (sender) {
            case null -> throw new IllegalArgumentException("Remetente não configurado para: " + type);
            case INotificationSender s -> s.send(recipient, message);
        };
    }
}

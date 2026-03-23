package com.glecios.pattern.creational.factory.model;

public sealed interface INotificationSender 
permits EmailNotificationSender, SMSNotificationSender, PushNotificationSender{
    NotificationResult send(String recipient, String message);
}

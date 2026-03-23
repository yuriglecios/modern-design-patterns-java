package com.glecios.pattern.creational.factory.model;

public enum NotificationType {
    EMAIL("email", "E-mail"),
    SMS("sms", "SMS"),
    PUSH("push", "Push Notification");

    private final String beanName;
    private final String displayName;

    NotificationType(String beanName, String displayName) {
        this.beanName = beanName;
        this.displayName = displayName;
    }

    public String getBeanName() {
        return beanName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

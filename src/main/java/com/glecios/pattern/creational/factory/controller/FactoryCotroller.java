package com.glecios.pattern.creational.factory.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.glecios.pattern.creational.factory.creator.NotificationFactory;
import com.glecios.pattern.creational.factory.model.NotificationResult;
import com.glecios.pattern.creational.factory.model.NotificationType;

@RestController
@RequestMapping("/api/pattern/factory")
public class FactoryCotroller {

    private final NotificationFactory factory;

    public FactoryCotroller(NotificationFactory factory) {
        this.factory = factory;
    }

    @GetMapping("/{type}")
    public ResponseEntity<NotificationResult> sendNotification(
        @PathVariable NotificationType type,
        @RequestParam String recipient,
        @RequestParam String message
    ){
        return ResponseEntity.ok(factory.send(type, recipient, message));
    }

}

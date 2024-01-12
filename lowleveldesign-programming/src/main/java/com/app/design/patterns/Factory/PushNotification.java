package com.app.design.patterns.Factory;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an Push notification");
    }
}
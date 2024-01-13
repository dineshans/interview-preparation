package com.app.design.patterns.Factory;


public class NotificationServiceTesting {

    public static void main(String[] args) {

        NotificationFactory factory = new NotificationFactory();
        Notification notification = factory.createNotification("SMS");
        Notification notification1 = factory.createNotification("EMAIL");
        notification.notifyUser();
        notification1.notifyUser();
    }
}

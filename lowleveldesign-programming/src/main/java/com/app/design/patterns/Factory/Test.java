package com.app.design.patterns.Factory;

/*
When to use Factory Design patter -->
Factory Method Design Pattern define an interface for creating an object,
but let subclass decide which class to instantiate.
Factory Method lets a class defer instantiation to subclass.
*/
public class Test {

    public static void main(String[] args) {

        NotificationFactory factory = new NotificationFactory();
        Notification notification = factory.createNotification("SMS");
        Notification notification1 = factory.createNotification("EMAIL");
        notification.notifyUser();
        notification1.notifyUser();
    }
}

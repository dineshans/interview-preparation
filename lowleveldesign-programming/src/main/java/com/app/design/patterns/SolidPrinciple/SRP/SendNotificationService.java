package com.app.design.patterns.SolidPrinciple.SRP;

public class SendNotificationService {

    public void sendNotification(String mediumType) {

        if (mediumType.equalsIgnoreCase("email")) {
            System.out.println("From SendNotificationService - " + mediumType);
        }
    }
}

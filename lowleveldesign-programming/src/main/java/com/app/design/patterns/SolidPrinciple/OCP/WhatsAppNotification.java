package com.app.design.patterns.SolidPrinciple.OCP;

public class WhatsAppNotification implements Notification{
    @Override
    public void sendNotification(String mediumType) {
        System.out.println(mediumType + " notification");
    }

    @Override
    public void sendTransactionNotification(String mediumType) {
        System.out.println(mediumType + " notification - send transaction notification");
    }
}

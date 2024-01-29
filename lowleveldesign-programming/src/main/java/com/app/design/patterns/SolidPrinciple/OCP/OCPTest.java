package com.app.design.patterns.SolidPrinciple.OCP;

public class OCPTest {

    public static void main(String[] args) {

        Notification notification = new EmailNotification();
        notification.sendNotification("Email");

        Notification notification1 = new MobileNotification();
        notification.sendNotification("Mobile");

        Notification notification2 = new WhatsAppNotification();
        notification.sendNotification("WhatsApp");


    }
}

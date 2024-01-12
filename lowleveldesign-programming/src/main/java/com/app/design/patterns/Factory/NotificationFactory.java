package com.app.design.patterns.Factory;

public class NotificationFactory {

    public Notification createNotification(String channel) {

        Notification notification = null;

        if(channel == null || channel.isEmpty()){
            return  null;
        }
        if(channel.equals("SMS")){
            notification = new SMSNotification();
        }
        if(channel.equals("EMAIL")){
            notification = new EmailNotification();
        }
        if(channel.equals("PUSH")){
            notification = new PushNotification();
        }
        return notification;
    }
}

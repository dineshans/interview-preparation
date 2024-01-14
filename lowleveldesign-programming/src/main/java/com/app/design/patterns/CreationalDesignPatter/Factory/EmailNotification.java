package com.app.design.patterns.CreationalDesignPatter.Factory;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {

        System.out.println("Sending Email notification");
    }
}

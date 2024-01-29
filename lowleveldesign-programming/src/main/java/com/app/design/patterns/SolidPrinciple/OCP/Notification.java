package com.app.design.patterns.SolidPrinciple.OCP;

public interface Notification {

    public void sendNotification(String mediumType);
    public void sendTransactionNotification(String mediumType);

}

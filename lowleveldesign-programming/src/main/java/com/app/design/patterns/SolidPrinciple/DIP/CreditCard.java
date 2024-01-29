package com.app.design.patterns.SolidPrinciple.DIP;

public class CreditCard implements BankCards {

    @Override
    public void doTransaction(int amount) {
        System.out.println("CreditCard transaction of amount - " + amount);
    }
}

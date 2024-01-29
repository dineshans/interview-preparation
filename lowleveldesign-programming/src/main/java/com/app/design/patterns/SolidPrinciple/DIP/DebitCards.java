package com.app.design.patterns.SolidPrinciple.DIP;

public class DebitCards implements BankCards{
    @Override
    public void doTransaction(int amount) {
        System.out.println("DebitCards transaction of amount - " + amount);
    }
}

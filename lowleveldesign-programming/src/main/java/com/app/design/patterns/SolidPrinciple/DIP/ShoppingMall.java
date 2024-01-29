package com.app.design.patterns.SolidPrinciple.DIP;

public class ShoppingMall {

    private BankCards bankCards;
    public ShoppingMall(BankCards bankCards){

        this.bankCards = bankCards;
    }

    public void doPayment(int amount){
        bankCards.doTransaction(amount);
    }
}

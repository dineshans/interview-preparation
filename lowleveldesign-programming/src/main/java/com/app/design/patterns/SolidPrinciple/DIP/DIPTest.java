package com.app.design.patterns.SolidPrinciple.DIP;

public class DIPTest {

    public static void main(String[] args) {

        BankCards bankCards = new DebitCards();
        ShoppingMall shoppingMall = new ShoppingMall(bankCards);

        shoppingMall.doPayment(1000);

    }
}

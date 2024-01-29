package com.app.design.patterns.SolidPrinciple.SRP;

public class SRPTest {

    public static void main(String[] args) {

        LoanService loanService = new LoanService();
        loanService.getLoanInterestInfo("home-loan");

        PrintService printService = new PrintService();
        printService.printPassBook();

        SendNotificationService sendNotificationService = new SendNotificationService();
        sendNotificationService.sendNotification("email");
    }
}

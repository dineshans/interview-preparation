package com.app.design.patterns.SolidPrinciple.SRP;

public class LoanService {

    public void getLoanInterestInfo(String loanType){

        if(loanType.equals("home-loan")){
            System.out.println("From LoanService - " + loanType);

        }
        if(loanType.equals("personal-loan")){
            System.out.println("From LoanService - " + loanType);

        }
        if(loanType.equals("car-loan")){
            System.out.println("From LoanService - " + loanType);

        }


    }
}

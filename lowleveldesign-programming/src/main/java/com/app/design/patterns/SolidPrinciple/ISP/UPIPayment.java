package com.app.design.patterns.SolidPrinciple.ISP;


/*
 * Google Pay support payMoney, getScratchCard, getCashBackAsCreditBalance
 * All features
 *
 * But PayTM not support getCashBackAsCreditBalance, that's why created seperate interface for getCashBackAsCreditBalance
 *
 */
public interface UPIPayment {

    public void payMoney();

    public void getScratchCard();
}

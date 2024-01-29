package com.app.design.patterns.SolidPrinciple.ISP;

/*
 * Google Pay support payMoney, getScratchCard, getCashBackAsCreditBalance
 * All features
 *
 * But PayTM not support getCashBackAsCreditBalance, that's why created seperate interface getCashBackAsCreditBalance
 */
public interface CashbackManager {

    public void getCashBackAsCreditBalance();
}

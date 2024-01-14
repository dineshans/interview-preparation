package com.app.design.patterns.SolidPrinciple.OCP;

public class SuperMan implements SuperHero {
    @Override
    public void attach() {
        System.out.println("Attack by Superman");
    }
}

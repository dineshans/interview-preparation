package com.app.design.patterns.AbstractFactory;

public class MacBookButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering a Macbook button");
    }
}

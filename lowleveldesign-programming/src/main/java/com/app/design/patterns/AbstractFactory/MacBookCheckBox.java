package com.app.design.patterns.AbstractFactory;

public class MacBookCheckBox implements CheckBox{
    @Override
    public void render() {
        System.out.println("Rendering a macbook checkbox");
    }
}

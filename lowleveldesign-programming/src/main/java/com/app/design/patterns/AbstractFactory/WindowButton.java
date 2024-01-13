package com.app.design.patterns.AbstractFactory;

public class WindowButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Windows button");
    }
}

package com.app.design.patterns.AbstractFactory;

public class WindowCheckBox implements CheckBox{
    @Override
    public void render() {
        System.out.println("Rendering a Windows checkbox");
    }
}

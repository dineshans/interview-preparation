package com.app.design.patterns.AbstractFactory;

public class WindowFactory implements GuiFactory{
    @Override
    public Button crteateButton() {
        return new WindowButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowCheckBox();
    }
}

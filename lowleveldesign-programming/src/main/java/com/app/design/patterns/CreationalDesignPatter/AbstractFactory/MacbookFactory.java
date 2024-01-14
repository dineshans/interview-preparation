package com.app.design.patterns.CreationalDesignPatter.AbstractFactory;

public class MacbookFactory implements GuiFactory {
    @Override
    public Button crteateButton() {
        return new MacBookButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacBookCheckBox();
    }
}

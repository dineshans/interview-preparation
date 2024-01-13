package com.app.design.patterns.AbstractFactory;

public class Test {

    public static void main(String[] args) {

        GuiFactory factory;

        // Window factory
        factory = new WindowFactory();
        Button windowButton = factory.crteateButton();
        windowButton.render();

        CheckBox windowCheckbox = factory.createCheckBox();
        windowCheckbox.render();

        // macbook factory
        factory = new MacbookFactory();
        Button macbookButton = factory.crteateButton();
        macbookButton.render();

        CheckBox macbookCheckbox = factory.createCheckBox();
        macbookCheckbox.render();
    }
}

package com.app.design.patterns.CreationalDesignPatter.AbstractFactory;

/*
When to use Abstract Factory Design patter -->
This pattern is useful when there is a need to create
multiple related objects that belong to a common family or share a common theme.
* */

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

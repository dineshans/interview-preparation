package com.app.design.patterns.Decorate;

public class CarDecorator implements Car {

    Car car;
    public CarDecorator(Car car){
       this.car = car;
    }
    @Override
    public void assemble() {
        this.car.assemble();
        System.out.println(" Adding features of Sports Car.");
    }
}

package com.kodilla.inheritance.homework;

public class OperationSystemPlus extends OperatingSystem {

    public OperationSystemPlus(int publicationyear) {
        super(publicationyear);
    }

    @Override
    public void turnOn() {

        System.out.println("Publication year is turned on now");
    }

    @Override
    public void turnOff() {

        System.out.println("Publication year is turned off now");
    }
}

package com.kodilla.inheritance.homework;

public class OperationSystemPlus extends OperatingSystem {
    public OperationSystemPlus(int publicationyear) {
        super(publicationyear);
    }
    public void turnOnMonth() {
        System.out.println("Turn on month...");

    }

    public void turnOffMonth() {
        System.out.println("Turn off month...");
    }

    @Override
    public void showName() {
        System.out.println("Sony Vaio");
    }
}

package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int publicationyear;

    public OperatingSystem(int publicationyear) {
        this.publicationyear = publicationyear;
    }

    public void turnOn() {
        System.out.println("Publication year is turned on");
    }

    public void turnOff() {
        System.out.println("Publication year is turned off");
    }

    public void showName() {
        System.out.println("Sony Vaio");
    }
    public int getPublicationyear(); {
        return publicationyear;
    }

}

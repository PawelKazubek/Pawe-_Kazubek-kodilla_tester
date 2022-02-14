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

    public int getPublicationyear() {
        return publicationyear;
    }
    public void displayPublicationYear() {
        System.out.println("Publication year: " + publicationyear);
    }
}

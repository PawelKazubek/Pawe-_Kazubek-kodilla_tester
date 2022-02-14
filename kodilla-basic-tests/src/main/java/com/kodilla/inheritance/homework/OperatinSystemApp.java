package com.kodilla.inheritance.homework;

public class OperatinSystemApp {
    public static void main (String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2018);
        operatingSystem.turnOn();

        OperationSystemPlus operationSystemPlus = new OperationSystemPlus(2016);
        operationSystemPlus.turnOn();
        System.out.println(operationSystemPlus.getPublicationyear());
        }

}

package com.kodilla.inheritance.homework;

public class OperatinSystemApp {
    public static void main (String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2020);
        operatingSystem.turnOn();

        OperationSystemPlus operationSystemPlus = new OperationSystemPlus(7);
        operationSystemPlus.turnOnMonth();
        System.out.println();
    }
}

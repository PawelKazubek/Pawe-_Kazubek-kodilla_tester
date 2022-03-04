package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(50);
        doRace(ford);

        Lexus lexus = new Lexus(60);
        doRace(lexus);

        Infiniti infiniti = new Infiniti(70);
        doRace(infiniti);

    }
    private static void doRace(Car car) {
        car.increaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());

    }
}

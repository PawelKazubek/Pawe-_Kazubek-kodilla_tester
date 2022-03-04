package com.kodilla.collections.interfaces.homework;

public class Lexus implements Car {

    int speed;
    private static final int IncreaseValue = 35;
    private static final int DecreaseValue = -15;

    public Lexus(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + IncreaseValue;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed + DecreaseValue;
    }
}

package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    int speed;
    private static final int IncreaseValue = 30;
    private static final int DecreaseValue = -20;

    public Ford(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + IncreaseValue;
        System.out.println("Ford increase speed is: " + speed);

    }

    @Override
    public void decreaseSpeed() {
        speed = speed + DecreaseValue;
        System.out.println("Ford decrease speed is: " + speed);

    }
}
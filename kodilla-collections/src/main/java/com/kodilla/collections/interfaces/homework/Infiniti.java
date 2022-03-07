package com.kodilla.collections.interfaces.homework;

public class Infiniti implements Car {

    int speed;
    private static final int IncreaseValue = 40;
    private static final int DecreaseValue = -25;

    public Infiniti(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + IncreaseValue;
        System.out.println("Infiniti increase speed is: " + speed);
    }

    @Override
    public void decreaseSpeed() {
        speed = speed + DecreaseValue;
        System.out.println("Infiniti decrease speed is: " + speed);
    }
}

package com.kodilla.collections.interfaces.homework;

public class Infiniti implements Car {
    int speed;

    public Infiniti(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public void increaseSpeed() {

    }

    @Override
    public void decreaseSpeed() {

    }
}

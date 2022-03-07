package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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
        System.out.println("Lexus increase speed is: " + speed);
    }

    @Override
    public void decreaseSpeed() {
        speed = speed + DecreaseValue;
        System.out.println("Lexus decrease speed is: " + speed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lexus lexus = (Lexus) o;
        return speed == lexus.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}

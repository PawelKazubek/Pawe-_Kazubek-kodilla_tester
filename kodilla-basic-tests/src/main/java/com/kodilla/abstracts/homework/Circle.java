package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }


    @Override
    public double giveArea() {
        return PI * r *r;
    }

    @Override
    public double givePerimeter() {
        return 2* PI *r;
    }
}

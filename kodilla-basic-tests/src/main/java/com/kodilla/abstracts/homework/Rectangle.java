package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double giveArea() {
        return a*b;
    }

    @Override
    public double givePerimeter() {
        return 2*a+2*b;
    }
}

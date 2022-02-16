package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        super(4, 6);
    }
    @Override
    public double givePerimeter() {
        return 2*getA()+2*getB();
    }
}

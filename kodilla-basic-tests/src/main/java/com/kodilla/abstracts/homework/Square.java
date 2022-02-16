package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private double a;
    private double b;

    public Square(double a, double b) {
        super(a, b);
    }
    @Override
    public double giveArea() {
        return getA()*getB();
    }
}

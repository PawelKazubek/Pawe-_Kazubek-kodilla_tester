package com.kodilla.abstracts.homework;

public abstract class Shape {

    private double a;
    private double b;
    static double PI = 3.1415927;
    private double r;

    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getR() {
        return r;
    }
    public double circleArea() {
        return PI * r * r;
    }
    public double circlePerimeter() {
        return 2 * PI * r;
    }
    public double giveArea() {
        return getA()*getB();
    }

    public double givePerimeter() {
        return 2*getA()+2*getB();
    }
}

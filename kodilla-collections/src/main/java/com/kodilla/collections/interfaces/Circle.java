package com.kodilla.collections.interfaces;

import static java.lang.Math.PI;

public class Circle implements Shape {
    private double radious;

    public Circle(double radious) {
        this.radious = radious;
    }

    public double getArea() {
        return PI * radious * radious;
    }

    public double getPerimeter() {
        return 2 * PI * radious;
    }
}

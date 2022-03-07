package com.kodilla.collections.interfaces;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Circle{" +
                "radious=" + radious +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radious, radious) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radious);
    }
}

package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    public Rectangle() {
        super(4, 6);
    }
    @Override
    public double givePerimeter() {
        return 2*getA()+2*getB();
    }
}

package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.circleArea(10);

        Shape rectangle = new Rectangle();
        rectangle.givePerimeter();
    }
}

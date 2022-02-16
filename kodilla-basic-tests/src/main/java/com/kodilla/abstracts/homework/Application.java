package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        double circleArea = circle.giveArea();
            System.out.println("Pole koła: " + circleArea);

        double circlePerimeter = circle.givePerimeter();
            System.out.println("Obwód koła: " + circlePerimeter);

        Shape rectangle = new Rectangle(2, 3);
        double rectangleArea = rectangle.giveArea();
            System.out.println("Pole prostokąta: "+ rectangleArea);

        double rectanglePerimeter = rectangle.givePerimeter();
        System.out.println("Obwód prostokąta: " + rectanglePerimeter);

        Shape square = new Square(5);
        double squareArea = square.giveArea();
        System.out.println("Pole kwadratu: " + squareArea);

        double squarePerimeter = square.givePerimeter();
        System.out.println("Obwód kwadratu: " + squarePerimeter);

    }
}

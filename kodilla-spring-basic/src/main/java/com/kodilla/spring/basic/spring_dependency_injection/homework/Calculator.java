package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;

    @Autowired
    public void setDisplay(Display display) {
        this.display = display;
    }
    public double add(double a, double b) {
        this.display.Display(a + b);
        double add = a + b;
        display.Display(add);
        return add;
    }

    public double subtract(double a, double b) {
        this.display.Display(a - b);
        double subtract = a - b;
        display.Display(subtract);
        return subtract;
    }
    public double multiply(double a, double b) {
        this.display.Display(a * b);
        double multiply = a * b;
        display.Display(multiply);
        return multiply;
    }
    public double divide(double a, double b) {
        this.display.Display(a / b);
        double divide = a / b;
        display.Display(divide);
        return divide;
    }
}

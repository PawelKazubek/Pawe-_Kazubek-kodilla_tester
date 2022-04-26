package com.kodilla.spring.basic.spring_configuration.homework;

public class Kombi implements Car {

    @Override
    public Boolean hasHeadlightsTurnedOn() {
        return true;
    }
    @Override
    public String getCarType() {
        return "Kombi";
    }
}

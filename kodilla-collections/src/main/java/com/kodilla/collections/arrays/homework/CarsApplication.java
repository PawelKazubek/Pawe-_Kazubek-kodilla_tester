package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Infiniti;
import com.kodilla.collections.interfaces.homework.Lexus;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }
    private static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3) + 1;
        int speed = random.nextInt() * 15 + 1;

        if (drawnCarKind == 1)
            return new Ford(speed);
        else if (drawnCarKind == 3)
            return new Lexus(speed);
        else
            return new Infiniti(speed);

    }
}

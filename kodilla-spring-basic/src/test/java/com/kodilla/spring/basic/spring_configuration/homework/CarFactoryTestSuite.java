package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class CarFactoryTestSuite {

    @Test
    public void testCarCreated() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        SUV suv = context.getBean(SUV.class);
        String carType = suv.getCarType();
        Assertions.assertEquals("SUV", carType);
    }
    @Test
    public void shouldCreateCarBeanAndCarType() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        SUV suv = (SUV) context.getBean("createSUV");
        String carType = suv.getCarType();
        Assertions.assertEquals("SUV", carType);
    }
    @Test
    public void shouldCreateRandomCar() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("randomCar");
        String carType = car.getCarType();
        System.out.println(carType);
        List<String> possibleCars = Arrays.asList("SUV", "Kombi", "Cabrio");
        Assertions.assertTrue(possibleCars.contains(carType));
    }
}

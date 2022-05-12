package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class CarFactory {

   LocalDate month = LocalDate.now();

    @Bean
    public SUV createSUV() {
        return new SUV();
    }

    @Bean
    public Car randomCar() {
        Car car;
        if ((month.getMonthValue() == 12) || (month.getMonthValue() == 1) || (month.getMonthValue() == 2)) {
           car = new SUV();
        } else if ((month.getMonthValue() == 3) || (month.getMonthValue() == 4) || (month.getMonthValue() == 5) ||
                (month.getMonthValue() == 9) || (month.getMonthValue() == 10) || (month.getMonthValue() == 11))  {
            car = new Kombi();
        } else  {
           car = new Cabrio();
        }
        return car;
    }
}

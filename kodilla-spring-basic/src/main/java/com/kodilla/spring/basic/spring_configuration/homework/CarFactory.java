package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;

@Configuration
public class CarFactory {

    LocalDate month = LocalDate.now();
    LocalTime hour = LocalTime.now();

    public CarFactory(LocalDate month, LocalTime hour) {
        this.month = month;
        this.hour = hour;
    }

    @Bean
    public SUV createSUV() {
        return new SUV();
    }

    @Bean
    public Car randomCar() {
        Car car;
        if (month.getMonth() == 12 & (month.getMonth() == 1) && (month.getMonth() == 2)) && (hour.getHour() == (20 - 6)) {
            car = new SUV();
        } else if (LocalDate.now().getMonth(2, 3, 4, 8, 9, 10)) && (LocalTime.now().getHour(20.00 - 6.00))) {
            car = new Kombi();
        } else (LocalDate.now().getMonth(5, 6, 7)) && (LocalTime.now().getHour(20.00 - 6.00))) {
            car = new Cabrio();
        }
        return car;
    }
}

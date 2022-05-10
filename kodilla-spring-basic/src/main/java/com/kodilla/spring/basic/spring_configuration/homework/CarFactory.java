package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;

@Configuration
public class CarFactory {

  //  LocalDate month = LocalDate.now();

   // public CarFactory(LocalDate month) {
     //   this.month = month;
   // }

    @Bean
    public SUV createSUV() {
        return new SUV();
    }

   // @Bean
    //public Car randomCar() {
        //Car car;
        //if ((month.getMonthValue() == 12) && (month.getMonthValue() == 1) && (month.getMonthValue() == 2))
            // {
          //  car = new SUV();
        //} else if ((month.getMonthValue() == 3) && (month.getMonthValue() == 4) && (month.getMonthValue() == 8) &&
               // (month.getMonthValue() == 9) && (month.getMonthValue() == 10) && (month.getMonthValue() == 11))  {
           // car = new Kombi();
       // } else ((month.getMonthValue() == 5) && (month.getMonthValue() == 6) && (month.getMonthValue() == 7)) {
           // car = new Cabrio();
       // }
       // return car;
   // }
}

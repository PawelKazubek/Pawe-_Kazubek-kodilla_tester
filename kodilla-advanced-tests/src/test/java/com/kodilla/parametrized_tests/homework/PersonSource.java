package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {
   static Stream<Arguments> provideStringForTestingBMI() {
      return Stream.of(
               Arguments.of("Severely underweight", new Person(1.80,51)),
               Arguments.of("Obese Class IV (Morbidly Obese)", new Person(1.68,141)),
               Arguments.of("Normal (healthy weight)", new Person(1.85,81)),
               Arguments.of("Overweight", new Person(1.79,85)),
               Arguments.of("Obese Class III (Very severely obese)", new Person(1.63,115)),
               Arguments.of("Obese Class V (Super Obese)", new Person(1.71,159))
        );
    }
}


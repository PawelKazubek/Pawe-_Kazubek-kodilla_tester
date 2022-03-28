package com.kodilla.parametrized_tests.homework;

import java.util.stream.Stream;

public class PersonSource {
    static Stream<Arguments> provideStringForTestingBMI() {
        return Stream.of(
                Arguments.of("25", new Person(1.75,75)),
                Arguments.of("50", new Person(1.68,141)),
                Arguments.of("25", new Person(1.85,81)),
                Arguments.of("27", new Person(1.79,85)),
                Arguments.of("36", new Person(1.63,95)),
                Arguments.of("38", new Person(1.91,139)),
        );
    }

}

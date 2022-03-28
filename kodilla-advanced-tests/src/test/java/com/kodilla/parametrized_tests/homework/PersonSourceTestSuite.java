package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonSourceTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.StringSources#provideStringForTestingBMI")
    public void shouldCountBMI(String expected, Person person) {
        assertEquals(expected, person.getBMI());
    }


}

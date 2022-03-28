package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GamblingMachineTestSuite {

    private GamblingMachine machine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/stringGamblingNumbers.csv", numLinesToSkip = 1)
    public void shouldCalculateUserNumber (String userNumbers, int expected) throws InvalidNumbersException {
      String[] numbers = userNumbers.split(",");
      Set<Integer> number = new HashSet<>();
        assertEquals(expected, machine.howManyWins(number));
    }

}

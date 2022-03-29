package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {

    private GamblingMachine machine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/stringGamblingNumbers.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionIfInvalidCountOfNumbers (String userNumbers) throws InvalidNumbersException {
        Set<Integer> number = convertToSet(userNumbers);
        assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(number));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/stringNumbersOutsideRange.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionIfInvalidNumbersOutsideRange (String userNumbers) throws InvalidNumbersException {
        Set<Integer> number = convertToSet(userNumbers);
        assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(number));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/stringValidGamblingNumbers.csv", numLinesToSkip = 1)
    public void shouldNotThrowExceptionIfValidNumbers (String userNumbers) throws InvalidNumbersException {
        Set<Integer> number = convertToSet(userNumbers);
        int result = machine.howManyWins(number);
        assertTrue(result >=0);
        assertTrue(result<=6);
    }

    private Set<Integer> convertToSet(String userNumbers) {
        String[] numbers = userNumbers.split(",");
        Set<Integer> number = new HashSet<>();
        for (String r : numbers) {
            int number1 = Integer.parseInt(r);
            number.add(number1);
        }
        return number;
    }

}

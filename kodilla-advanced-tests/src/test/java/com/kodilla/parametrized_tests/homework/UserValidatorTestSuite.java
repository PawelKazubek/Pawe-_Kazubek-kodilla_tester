package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Pa"} )
    public void shouldValidateUsername(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @CsvSource(value = {})
    public void shouldValidateEmail(String email, String expected) {
        assertEquals(expected,validator.validateEmail(email));

    }


}

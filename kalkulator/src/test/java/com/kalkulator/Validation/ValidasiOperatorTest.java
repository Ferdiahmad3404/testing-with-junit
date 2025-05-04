package com.kalkulator.Validation;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidasiOperatorTest {

    @ParameterizedTest
    @ValueSource(chars = {'+', '-', '*', '/'})
    @Tag("validasiOperator")
    void validOperators_shouldReturnTrue(char operator) {
        // Act
        boolean result = ValidasiOperator.validasi(operator);

        // Assert
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(chars = {'%'})
    @Tag("validasiOperator")
    void invalidOperator_shouldReturnFalse(char operator) {
        // Act
        boolean result = ValidasiOperator.validasi(operator);

        // Assert
        assertFalse(result);
    }
}

package com.kalkulator.Validation;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ValidasiInputAngkaTest {

    @Test
    @Tag("validasiInputAngka")
    void validInput_shouldReturnTrue() {
        // Arrange
        String input = "42.5";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);

        // Act
        boolean result = ValidasiInputAngka.validasi(scanner);

        // Assert
        assertTrue(result);
    }

    @Test
    @Tag("validasiInputAngka")
    void invalidInput_shouldReturnFalse() {
        // Arrange
        String input = "abc";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);

        // Act
        boolean result = ValidasiInputAngka.validasi(scanner);

        // Assert
        assertFalse(result);
    }
}

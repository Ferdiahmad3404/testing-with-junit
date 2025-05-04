package com.kalkulator.Validation;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidasiPembagiTest {

    // Test case untuk pembagian dengan angka2 = 2 (valid)
    @Test
    @Tag("validasiPembagi")
    void validasiPembagi_ValidInput() {
        // Act
        boolean result = ValidasiPembagi.validasi('/', 2);

        // Assert
        assertTrue(result);  // Pembagian dengan 2 harus valid dan mengembalikan true
    }

    // Test case untuk pembagian dengan angka2 = 0 (invalid)
    @Test
    @Tag("validasiPembagi")
    void validasiPembagi_InvalidInput() {
        // Act
        boolean result = ValidasiPembagi.validasi('/', 0);

        // Assert
        assertFalse(result);  // Pembagian dengan 0 harus invalid dan mengembalikan false
    }
}

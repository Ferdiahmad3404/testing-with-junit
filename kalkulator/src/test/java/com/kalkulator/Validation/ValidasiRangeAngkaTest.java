package com.kalkulator.Validation;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidasiRangeAngkaTest {

    // Test case gabungan untuk validasi rentang angka dengan 1 data valid dan 1 data invalid
    @ParameterizedTest
    @ValueSource(doubles = {100, 32768})  // 100 valid, 32768 invalid
    @Tag("validasiRangeAngka")
    void validasiRangeAngka(double input) {
        if (input >= -32768 && input <= 32767) {
            // Valid input
            boolean result = ValidasiRangeAngka.validasi(input);
            assertTrue(result);  // Angka dalam rentang valid harus menghasilkan true
        } else {
            // Invalid input
            boolean result = ValidasiRangeAngka.validasi(input);
            assertFalse(result);  // Angka di luar rentang valid harus menghasilkan false
        }
    }
}

package com.kalkulator.Operator;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TambahOperatorTest {

    @ParameterizedTest(name = "TC{index} => {0} + {1} = {2}")
    @CsvSource({
            "2, 3, 5",      // Positif + Positif
            "-1, 4, 3",     // Negatif + Positif
            "0, 0, 0",      // Nol + Nol
            "-2, -3, -5",   // Negatif + Negatif
            "5.5, 4.5, 10"  // Desimal + Desimal
    })
    @Tag("tambahOperator")
    void testTambahOperator(double a, double b, double expected) {
        // Precondition:
        // Angka pertama: a, Angka kedua: b

        // Action:
        double actual = TambahOperator.hitung(a, b);

        // Expectation:
        // Hasil yang diharapkan: expected

        // Assertion:
        assertEquals(expected, actual, 0.0001);
    }
}

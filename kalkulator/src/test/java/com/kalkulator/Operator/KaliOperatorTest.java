package com.kalkulator.Operator;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class KaliOperatorTest {

    @ParameterizedTest(name = "Test {index}: {0} * {1} = {2}")
    @CsvSource({
            "4, 5, 20",
            "-3, 6, -18",
            "0, 100, 0"
    })
    @Tag("kaliOperator")
    void testPerkalian(double a, double b, double expected) {
        // ==== Precondition ====
        // Nilai input: a dan b adalah dua bilangan real yang akan dikalikan

        // ==== Expectation ====
        // Diharapkan hasil dari KaliOperator.hitung(a, b) = expected

        // ==== Action ====
        double actual = KaliOperator.hitung(a, b);

        // ==== Assert ====
        assertEquals(expected, actual, 0.0001,
                () -> String.format("Expected %.2f * %.2f = %.2f, but got %.2f", a, b, expected, actual));
    }
}

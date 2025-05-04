package com.kalkulator.Operator;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KurangOperatorTest {

    @ParameterizedTest(name = "TC{index} => {0} - {1} = {2}")
    @CsvSource({
            "5, 3, 2",     // Precond: angka1 > angka2, Expect: 2
            "3, 5, -2",    // Precond: angka1 < angka2, Expect: -2
            "4, 4, 0"      // Precond: angka1 == angka2, Expect: 0
    })
    @Tag("kurangOperator")
    void testKurangOperator(double a, double b, double expected) {
        // Precondition
        // Input angka1: a, angka2: b

        // Action
        double actual = KurangOperator.hitung(a, b);

        // Expectation
        // Hasil yang diharapkan: expected

        // Assertion
        assertEquals(expected, actual, 0.0001);
    }
}

package com.kalkulator.Operator;

import com.kalkulator.Error.ErrorPembagianNol;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class BagiOperatorTest {

    @Test
    void testPembagianValid() {
        // Precondition: Angka valid
        double a = 10;
        double b = 2;

        // Expectation: Tidak ada exception, hasil = 5
        double expected = 5.0;

        // Act
        double actual = BagiOperator.hitung(a, b);

        // Assert
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void testPembagianDenganNol() {
        // Precondition: b = 0
        double a = 10;
        double b = 0;

        // Mocking static method ErrorPembagianNol.tampilkan()
        try (MockedStatic<ErrorPembagianNol> mockedStatic = mockStatic(ErrorPembagianNol.class)) {

            // Expectation: ArithmeticException dilempar
            ArithmeticException thrown = assertThrows(
                    ArithmeticException.class,
                    () -> BagiOperator.hitung(a, b),
                    "Harus melempar ArithmeticException"
            );

            // Verifikasi bahwa method tampilkan() dipanggil
            mockedStatic.verify(ErrorPembagianNol::tampilkan, times(1));

            // Optional: Verifikasi pesan error
            assertEquals("Tidak bisa membagi dengan nol.", thrown.getMessage());
        }
    }
}

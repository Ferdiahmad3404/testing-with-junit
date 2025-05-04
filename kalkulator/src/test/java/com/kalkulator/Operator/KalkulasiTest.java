package com.kalkulator.Operator;

import com.kalkulator.Operator.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class KalkulasiTest {

    @Test
    @Tag("kalkulasi")
    void testDelegasiKeTambahOperator() {
        try (MockedStatic<TambahOperator> mock = mockStatic(TambahOperator.class)) {
            mock.when(() -> TambahOperator.hitung(5, 2)).thenReturn(7.0);

            double result = Kalkulasi.hitung(5, 2, '+');

            // Verifikasi bahwa method hitung milik TambahOperator dipanggil
            mock.verify(() -> TambahOperator.hitung(5, 2));
            assert(result == 7.0);
        }
    }

    @Test
    @Tag("kalkulasi")
    void testDelegasiKeKurangOperator() {
        try (MockedStatic<KurangOperator> mock = mockStatic(KurangOperator.class)) {
            mock.when(() -> KurangOperator.hitung(5, 2)).thenReturn(3.0);

            double result = Kalkulasi.hitung(5, 2, '-');

            mock.verify(() -> KurangOperator.hitung(5, 2));
            assert(result == 3.0);
        }
    }

    @Test
    @Tag("kalkulasi")
    void testDelegasiKeKaliOperator() {
        try (MockedStatic<KaliOperator> mock = mockStatic(KaliOperator.class)) {
            mock.when(() -> KaliOperator.hitung(3, 4)).thenReturn(12.0);

            double result = Kalkulasi.hitung(3, 4, '*');

            mock.verify(() -> KaliOperator.hitung(3, 4));
            assert(result == 12.0);
        }
    }

    @Test
    @Tag("kalkulasi")
    void testDelegasiKeBagiOperator() {
        try (MockedStatic<BagiOperator> mock = mockStatic(BagiOperator.class)) {
            mock.when(() -> BagiOperator.hitung(8, 2)).thenReturn(4.0);

            double result = Kalkulasi.hitung(8, 2, '/');

            mock.verify(() -> BagiOperator.hitung(8, 2));
            assert(result == 4.0);
        }
    }

    @Test
    @Tag("kalkulasi")
    void testOperatorTidakDikenal() {
        // Arrange
        double angka1 = 5;
        double angka2 = 2;
        char operator = '^';  // Operator yang tidak dikenal

        // Act & Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            Kalkulasi.hitung(angka1, angka2, operator);
        });

        // Assert
        assertEquals("Operator tidak dikenal", thrown.getMessage());
    }
}

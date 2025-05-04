package com.kalkulator.Input;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class InputAngkaTest {

    @Test
    @Tag("inputAngka")
    void testGetInputAngkaValid() {
        // Arrange - Siapkan Scanner yang dimock
        Scanner scannerMock = mock(Scanner.class);
        when(scannerMock.hasNextDouble()).thenReturn(true);
        when(scannerMock.nextDouble()).thenReturn(15.0);

        // Act - Panggil metode yang diuji
        double hasil = InputAngka.getInput(scannerMock, "Masukkan angka:");

        // Assert - Periksa hasil
        assertEquals(15.0, hasil, "InputAngka harus mengembalikan angka yang valid.");
        verify(scannerMock, times(1)).hasNextDouble();
        verify(scannerMock, times(1)).nextDouble();
    }

    @Test
    @Tag("inputAngka")
    void testGetInputAngkaTidakValid() {
        // Arrange - Siapkan Scanner yang dimock
        Scanner scannerMock = mock(Scanner.class);
        when(scannerMock.hasNextDouble()).thenReturn(false, true);
        when(scannerMock.nextDouble()).thenReturn(20.0);

        // Act - Panggil metode yang diuji
        double hasil = InputAngka.getInput(scannerMock, "Masukkan angka:");

        // Assert - Periksa hasil
        assertEquals(20.0, hasil, "InputAngka harus mencoba ulang hingga angka valid dimasukkan.");
        verify(scannerMock, times(2)).hasNextDouble();
    }
}
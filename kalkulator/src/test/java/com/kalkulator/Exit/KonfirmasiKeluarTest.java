package com.kalkulator.Exit;

import com.kalkulator.View.Information.ViewKonfirmasiKeluar;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class KonfirmasiKeluarTest {

    @Test
    @Tag("konfirmasiKeluar")
    void testTanyaLagiDenganInputY() {
        // Step 1: Arrange - Siapkan objek Scanner yang dimock
        Scanner scannerMock = mock(Scanner.class);
        when(scannerMock.next()).thenReturn("y");

        // Step 2: Act - Panggil metode yang diuji
        boolean hasil = KonfirmasiKeluar.tanyaLagi(scannerMock);

        // Step 3: Assert - Periksa hasil dan interaksi
        assertTrue(hasil, "Metode harus mengembalikan true jika input adalah 'y'");
        verify(scannerMock, times(1)).next();  // pastikan hanya dipanggil 1 kali
    }

    @Test
    @Tag("konfirmasiKeluar")
    void testTanyaLagiDenganInputN() {
        // Step 1: Arrange - Siapkan objek Scanner yang dimock
        Scanner scannerMock = mock(Scanner.class);
        when(scannerMock.next()).thenReturn("n");

        // Step 2: Act - Panggil metode yang diuji
        boolean hasil = KonfirmasiKeluar.tanyaLagi(scannerMock);

        // Step 3: Assert - Periksa hasil dan interaksi
        assertFalse(hasil, "Metode harus mengembalikan false jika input adalah 'n'");
        verify(scannerMock, times(1)).next();  // pastikan hanya dipanggil 1 kali
    }

    @Test
    @Tag("konfirmasiKeluar")
    void testTanyaLagiDenganInputSelainYdanN() {
        // Step 1: Arrange - Siapkan objek Scanner yang dimock
        Scanner scannerMock = mock(Scanner.class);

        // Mock input yang tidak valid pertama kali (misalnya "a")
        when(scannerMock.next()).thenReturn("a", "y");

        // Step 2: Act - Panggil metode yang diuji
        boolean hasil = KonfirmasiKeluar.tanyaLagi(scannerMock);

        // Step 3: Assert - Periksa hasil dan interaksi
        assertTrue(hasil, "Metode harus mengembalikan true jika input yang valid adalah 'y' setelah input yang tidak valid");

        // Verifikasi bahwa scanner.next() dipanggil dua kali
        verify(scannerMock, times(2)).next();
    }
}

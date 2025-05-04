package com.kalkulator.Exit;

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
}

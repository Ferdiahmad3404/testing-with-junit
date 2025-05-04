package com.kalkulator.View.Information;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ViewKonfirmasiKeluarTest {

    @Test
    @Tag("viewInformation")
    void testTampilkanKonfirmasi() {
        // Arrange - Tangkap output ke System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act - Panggil metode yang diuji
        ViewKonfirmasiKeluar.tampilkanKonfirmasi();

        // Assert - Periksa output
        assertEquals("Apakah Anda ingin melakukan perhitungan lagi? (y/n): ", outputStream.toString());
    }

    @Test
    @Tag("viewInformation")
    void testTampilkanKonfirmasiError() {
        // Arrange - Tangkap output ke System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act - Panggil metode yang diuji
        ViewKonfirmasiKeluar.tampilkanKonfirmasiError();

        // Assert - Periksa output
        assertEquals("Input tidak valid. Silakan masukkan 'y' untuk lanjut atau 'n' untuk keluar.\n", outputStream.toString().trim() + "\n");
    }
}

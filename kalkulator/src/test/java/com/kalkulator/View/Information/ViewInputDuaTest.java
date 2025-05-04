package com.kalkulator.View.Information;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ViewInputDuaTest {

    @Test
    @Tag("viewInformation")
    void testTampilkan() {
        // Act - Panggil metode yang diuji
        String pesan = ViewInputDua.tampilkan();

        // Assert - Periksa output
        assertEquals("Masukkan angka kedua: ", pesan);
    }
}

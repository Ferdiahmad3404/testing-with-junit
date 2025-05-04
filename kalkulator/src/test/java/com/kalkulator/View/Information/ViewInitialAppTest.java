package com.kalkulator.View.Information;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ViewInitialAppTest {

    @Test
    @Tag("viewInformation")
    void testTampilkan() {
        // Arrange - Tangkap output ke System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act - Panggil metode yang diuji
        ViewInitialApp.tampilkan();

        // Assert - Periksa output
        assertEquals("=== Kalkulator Modular ===\n", outputStream.toString().trim() + "\n");
    }
}
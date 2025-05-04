package com.kalkulator.View.Error;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ErrorPembagianNolTest {

    @Test
    @Tag("viewError")
    void testTampilkan() {
        // Arrange - Tangkap output ke System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act - Panggil metode yang diuji
        ErrorPembagianNol.tampilkan();

        // Assert - Periksa output
        assertEquals("Error: Tidak dapat membagi dengan nol.\n", outputStream.toString().trim() + "\n");
    }
}

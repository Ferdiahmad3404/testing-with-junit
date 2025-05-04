package com.kalkulator.View.Error;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ErrorRangeAngkaTest {

    @Test
    @Tag("viewError")
    void testTampilkan() {
        // Arrange - Tangkap output ke System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act - Panggil metode yang diuji
        ErrorRangeAngka.tampilkan();

        // Assert - Periksa output
        assertEquals("Error: Angka harus dalam rentang -32.768 hingga 32.767.\n", outputStream.toString().trim() + "\n");
    }
}

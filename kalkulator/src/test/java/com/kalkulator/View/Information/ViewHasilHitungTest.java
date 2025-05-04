package com.kalkulator.View.Information;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ViewHasilHitung {

    public static void tampilkan(double hasil) {
        System.out.println("Hasil: " + hasil);
    }
}

public class ViewHasilHitungTest {

    @Test
    @Tag("viewInformation")
    void testTampilkan() {
        // Arrange - Tangkap output ke System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act - Panggil metode yang diuji
        ViewHasilHitung.tampilkan(42.5);

        // Assert - Periksa output
        assertEquals("Hasil: 42.5\n", outputStream.toString());
    }
}

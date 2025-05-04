package com.kalkulator.Input;

import com.kalkulator.View.Error.ErrorOperatorInvalid;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class InputOperatorTest {

    @Test
    @Tag("inputOperator")
    void testGetInputOperatorValid() {
        // Arrange - Siapkan Scanner yang dimock
        Scanner scannerMock = mock(Scanner.class);
        when(scannerMock.next()).thenReturn("+");

        // Act - Panggil metode yang diuji
        char operator = InputOperator.getInput(scannerMock);

        // Assert - Periksa hasil
        assertEquals('+', operator, "InputOperator harus mengembalikan operator yang valid.");
        verify(scannerMock, times(1)).next();
    }

    @Test
    @Tag("inputOperator")
    void testGetInputOperatorTidakValid() {
        // Arrange - Siapkan Scanner yang dimock
        Scanner scannerMock = mock(Scanner.class);
        when(scannerMock.next()).thenReturn("x", "+");

        // Act - Panggil metode yang diuji
        char operator = InputOperator.getInput(scannerMock);

        // Assert - Periksa hasil
        assertEquals('+', operator, "InputOperator harus mencoba ulang hingga operator valid dimasukkan.");
        verify(scannerMock, times(2)).next();
    }
}
package com.kalkulator;

public class NumberValidator {
    public static boolean validasiRangeAngka(double angka) {
        return angka >= -32768 && angka <= 32767;
    }

    public static boolean validasiPembagi(char operator, double angka2) {
        if (operator == '/' && angka2 == 0) {
            MessagePrinter.cetakErrorPembagiNol();
            return false;
        }
        return true;
    }
}

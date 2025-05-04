package com.kalkulator.Validation;

public class ValidasiRangeAngka {
    public static boolean validasi(double angka) {
        return angka >= -32768 && angka <= 32767;
    }
}

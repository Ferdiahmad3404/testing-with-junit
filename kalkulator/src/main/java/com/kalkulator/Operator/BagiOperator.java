package com.kalkulator.Operator;

import com.kalkulator.View.Error.ErrorPembagianNol;

public class BagiOperator {
    public static double hitung(double a, double b) {
        if (b == 0) {
            ErrorPembagianNol.tampilkan();
            throw new ArithmeticException("Tidak bisa membagi dengan nol.");
        }
        return a / b;
    }
}

package com.kalkulator.Validation;

import com.kalkulator.View.Error.ErrorPembagianNol;

public class ValidasiPembagi {
    public static boolean validasi(char operator, double angka2) {
        if (operator == '/' && angka2 == 0) {
            ErrorPembagianNol.tampilkan();
            return false;
        }
        return true;
    }
}

package com.kalkulator.Validation;

public class ValidasiOperator {
    public static boolean validasi(char operator) {
        return operator == '+' || operator == '-' || operator == '*' || operator == '/';
    }
}

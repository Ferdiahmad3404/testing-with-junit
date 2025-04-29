package com.kalkulator;

public class OperatorValidator {
    public static boolean validasi(char operator) {
        return operator == '+' || operator == '-' || operator == '*' || operator == '/';
    }
}

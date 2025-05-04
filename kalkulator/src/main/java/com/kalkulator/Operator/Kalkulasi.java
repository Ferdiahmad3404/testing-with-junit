package com.kalkulator.Operator;

public class Kalkulasi {
    public static double hitung(double angka1, double angka2, char operator) {
        return switch (operator) {
            case '+' -> TambahOperator.hitung(angka1, angka2);
            case '-' -> KurangOperator.hitung(angka1, angka2);
            case '*' -> KaliOperator.hitung(angka1, angka2);
            case '/' -> BagiOperator.hitung(angka1, angka2);
            default -> throw new IllegalArgumentException("Operator tidak dikenal");
        };
    }
}

package com.kalkulator;

import java.util.Scanner;

public class InputHandler {

    public static Double inputAngka(Scanner scanner, String pesan) {
        Double angka = null;
        while (angka == null) {
            System.out.print(pesan);
            if (!scanner.hasNextDouble()) {
                MessagePrinter.cetakErrorInputBukanAngka();
                scanner.next(); // Clear input salah
                continue;
            }

            double input = scanner.nextDouble();
            if (!NumberValidator.validasiRangeAngka(input)) {
                MessagePrinter.cetakErrorRangeAngka();
                continue;
            }

            angka = input; // valid
        }
        return angka;
    }

    public static Character inputOperator(Scanner scanner) {
        Character operator = null;
        while (operator == null) {
            System.out.print("Masukkan operator (+, -, *, /): ");
            String input = scanner.next();
            if (input.length() != 1) {
                MessagePrinter.cetakErrorOperator();
                continue;
            }
            char op = input.charAt(0);
            if (!OperatorValidator.validasi(op)) {
                MessagePrinter.cetakErrorOperator();
                continue;
            }
            operator = op;
        }
        return operator;
    }

    public static boolean tanyaLagi(Scanner scanner) {
        System.out.print("Ingin menghitung lagi? (y/n): ");
        String jawab = scanner.next();
        return jawab.equalsIgnoreCase("y");
    }
}

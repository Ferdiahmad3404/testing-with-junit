package com.kalkulator;

import java.util.Scanner;

public class AppController {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Kalkulator Modular ===");

        while (true) {
            Double angka1 = InputHandler.inputAngka(scanner, "Masukkan angka pertama: ");
            Double angka2;
            Character operator;

            do {
                angka2 = InputHandler.inputAngka(scanner, "Masukkan angka kedua: ");
                operator = InputHandler.inputOperator(scanner);
            } while (!NumberValidator.validasiPembagi(operator, angka2));

            double hasil = Calculator.hitung(angka1, angka2, operator);
            MessagePrinter.cetakHasil(hasil);

            if (!InputHandler.tanyaLagi(scanner)) break;
        }

        scanner.close();
    }
}

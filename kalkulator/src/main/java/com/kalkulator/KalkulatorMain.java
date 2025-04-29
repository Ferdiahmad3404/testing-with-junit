package com.kalkulator;

import java.util.Scanner;

public class KalkulatorMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Kalkulator Modular dengan Validasi dan Operasi Terpisah ===");

        boolean lanjut = true;
        while (lanjut) {
            Double angka1 = inputAngka(scanner, "Masukkan angka pertama: ");
            if (angka1 == null) break;

            Double angka2 = inputAngka(scanner, "Masukkan angka kedua: ");
            if (angka2 == null) break;

            Character operator = inputOperator(scanner);
            if (operator == null) break;

            if (!validasiPembagi(operator, angka2)) break;

            double hasil = hitung(angka1, angka2, operator);
            System.out.println("Hasil: " + hasil);

            lanjut = tanyaLanjut(scanner);
        }

        System.out.println("Terima kasih telah menggunakan kalkulator!");
        scanner.close();
    }

    // ================================
    // Modul Input
    // ================================

    public static Double inputAngka(Scanner scanner, String pesan) {
        System.out.print(pesan);
        if (!validasiInputAdalahAngka(scanner)) {
            tampilkanErrorInputBukanAngka();
            scanner.next(); // Clear input salah
            return null;
        }
        double angka = scanner.nextDouble();
        if (!validasiRangeAngka(angka)) {
            tampilkanErrorRangeAngka();
            return null;
        }
        return angka;
    }

    public static Character inputOperator(Scanner scanner) {
        System.out.print("Pilih operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        if (!validasiOperator(operator)) {
            tampilkanErrorOperator();
            return null;
        }
        return operator;
    }

    // Modul baru: Menanyakan user mau lanjut atau keluar
    public static boolean tanyaLanjut(Scanner scanner) {
        System.out.print("Apakah Anda ingin melakukan perhitungan lagi? (y/n): ");
        char jawab = scanner.next().toLowerCase().charAt(0);
        return jawab == 'y';
    }

    // ================================
    // Modul Validasi
    // ================================

    public static boolean validasiInputAdalahAngka(Scanner scanner) {
        return scanner.hasNextDouble();
    }

    public static boolean validasiRangeAngka(double angka) {
        return angka >= -32768 && angka <= 32767;
    }

    public static boolean validasiOperator(char operator) {
        return operator == '+' || operator == '-' || operator == '*' || operator == '/';
    }

    public static boolean validasiPembagi(char operator, double angka2) {
        if (operator == '/' && angka2 == 0) {
            tampilkanErrorPembagiNol();
            return false;
        }
        return true;
    }

    // ================================
    // Modul Error Message
    // ================================

    public static void tampilkanErrorInputBukanAngka() {
        System.out.println("Error: Input harus berupa angka.");
    }

    public static void tampilkanErrorRangeAngka() {
        System.out.println("Error: Angka harus berada dalam rentang -32,768 hingga 32,767.");
    }

    public static void tampilkanErrorOperator() {
        System.out.println("Error: Operator tidak valid. Pilih hanya +, -, *, atau /.");
    }

    public static void tampilkanErrorPembagiNol() {
        System.out.println("Error: Pembagi tidak boleh nol.");
    }

    // ================================
    // Modul Perhitungan
    // ================================

    public static double hitung(double angka1, double angka2, char operator) {
        return switch (operator) {
            case '+' -> tambah(angka1, angka2);
            case '-' -> kurang(angka1, angka2);
            case '*' -> kali(angka1, angka2);
            case '/' -> bagi(angka1, angka2);
            default -> throw new IllegalArgumentException("Operator tidak dikenal: " + operator);
        };
    }

    public static double tambah(double angka1, double angka2) {
        return angka1 + angka2;
    }

    public static double kurang(double angka1, double angka2) {
        return angka1 - angka2;
    }

    public static double kali(double angka1, double angka2) {
        return angka1 * angka2;
    }

    public static double bagi(double angka1, double angka2) {
        if (angka2 == 0) {
            throw new ArithmeticException("Tidak dapat membagi dengan nol.");
        }
        return angka1 / angka2;
    }
}

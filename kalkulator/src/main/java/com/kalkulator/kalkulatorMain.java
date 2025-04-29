package com.kalkulator;

import java.util.Scanner;

public class kalkulatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Kalkulator Modular dengan Validasi Terpisah ===");

        // Membaca angka pertama
        Double angka1 = inputAngka(scanner, "Masukkan angka pertama: ");
        if (angka1 == null) return; // Jika invalid, keluar

        // Membaca angka kedua
        Double angka2 = inputAngka(scanner, "Masukkan angka kedua: ");
        if (angka2 == null) return;

        // Membaca operator
        Character operator = inputOperator(scanner);
        if (operator == null) return;

        // Validasi pembagian dengan nol
        if (!validasiPembagi(operator, angka2)) return;

        // Jika semua validasi OK, lakukan perhitungan
        double hasil = hitung(angka1, angka2, operator);
        System.out.println("Hasil: " + hasil);

        scanner.close();
    }

    // Modul untuk membaca angka dari input user
    public static Double inputAngka(Scanner scanner, String pesan) {
        System.out.print(pesan);
        if (!scanner.hasNextDouble()) {
            tampilkanErrorInputBukanAngka();
            return null;
        }
        double angka = scanner.nextDouble();
        if (!validasiRangeAngka(angka)) {
            return null;
        }
        return angka;
    }

    // Modul untuk membaca operator
    public static Character inputOperator(Scanner scanner) {
        System.out.print("Pilih operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        if (!validasiOperator(operator)) {
            return null;
        }
        return operator;
    }

    // Modul perhitungan
    public static double hitung(double angka1, double angka2, char operator) {
        double hasil = 0;
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                hasil = angka1 / angka2;
                break;
        }
        return hasil;
    }

    // =======================
    // Modul Validasi (a-f)
    // =======================

    // a. Validasi input adalah angka → Sudah di dalam inputAngka dengan hasNextDouble()

    // b. Validasi range angka
    public static boolean validasiRangeAngka(double angka) {
        if (angka < -32768 || angka > 32767) {
            System.out.println("Error: Angka harus berada dalam rentang -32,768 hingga 32,767.");
            return false;
        }
        return true;
    }

    // c. Validasi operator
    public static boolean validasiOperator(char operator) {
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            System.out.println("Error: Operator tidak valid. Pilih hanya +, -, *, atau /.");
            return false;
        }
        return true;
    }

    // d. Validasi pembagian dengan nol
    public static boolean validasiPembagi(char operator, double angka2) {
        if (operator == '/' && angka2 == 0) {
            System.out.println("Error: Pembagi tidak boleh nol.");
            return false;
        }
        return true;
    }

    // e. Menampilkan error input bukan angka
    public static void tampilkanErrorInputBukanAngka() {
        System.out.println("Error: Input harus berupa angka.");
    }

    // f. Semua validasi diatur berurutan, sudah dilakukan di main()

}

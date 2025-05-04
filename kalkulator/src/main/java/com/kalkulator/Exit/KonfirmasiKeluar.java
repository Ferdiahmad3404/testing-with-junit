package com.kalkulator.Exit;

import com.kalkulator.View.Information.ViewKonfirmasiKeluar;

import java.util.Scanner;

public class KonfirmasiKeluar {
    public static boolean tanyaLagi(Scanner scanner) {
        while (true) {
            ViewKonfirmasiKeluar.tampilkanKonfirmasi();
            String input = scanner.next().trim().toLowerCase();

            if (input.equals("y")) {
                return true ;
            } else if (input.equals("n")) {
                return false;
            } else {
                ViewKonfirmasiKeluar.tampilkanKonfirmasiError();
            }
        }
    }
}

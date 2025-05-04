package com.kalkulator.App;

import com.kalkulator.Input.InputAngka;
import com.kalkulator.Input.InputOperator;
import com.kalkulator.Operator.*;
import com.kalkulator.Validation.ValidasiPembagi;
import com.kalkulator.Exit.KonfirmasiKeluar;
import com.kalkulator.View.Information.*;

import java.util.Scanner;

public class KalkulatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ViewInitialApp.tampilkan();

        boolean lanjut = true;
        while (lanjut) {
            double angka1 = InputAngka.getInput(scanner, ViewInputSatu.tampilkan());
            double angka2;
            char operator;

            do {
                angka2 = InputAngka.getInput(scanner, ViewInputDua.tampilkan());
                operator = InputOperator.getInput(scanner);
            } while (!ValidasiPembagi.validasi(operator, angka2));

            double hasil = Kalkulasi.hitung(angka1, angka2, operator);

            ViewHasilHitung.tampilkan(hasil);

            lanjut = KonfirmasiKeluar.tanyaLagi(scanner);
        }

        ViewCloseApp.tampilkan();

        scanner.close();
    }
}

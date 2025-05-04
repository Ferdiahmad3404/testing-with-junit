package com.kalkulator.Input;

import com.kalkulator.Validation.ValidasiInputAngka;
import com.kalkulator.Validation.ValidasiRangeAngka;
import com.kalkulator.View.Error.ErrorInputBukanAngka;
import com.kalkulator.View.Error.ErrorRangeAngka;

import java.util.Scanner;

public class InputAngka {
    public static double getInput(Scanner scanner, String pesan) {
        Double angka = null;
        while (angka == null) {
            System.out.print(pesan);
            if (!ValidasiInputAngka.validasi(scanner)) {
                ErrorInputBukanAngka.tampilkan();
                scanner.next();
                continue;
            }
            double input = scanner.nextDouble();
            if (!ValidasiRangeAngka.validasi(input)) {
                ErrorRangeAngka.tampilkan();
                continue;
            }
            angka = input;
        }
        return angka;
    }
}

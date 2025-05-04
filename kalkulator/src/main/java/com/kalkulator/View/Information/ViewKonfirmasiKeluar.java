package com.kalkulator.View.Information;

public class ViewKonfirmasiKeluar {
    public static void tampilkanKonfirmasi(){
        System.out.print("Apakah Anda ingin melakukan perhitungan lagi? (y/n): ");
    }

    public static void tampilkanKonfirmasiError(){
        System.out.println("Input tidak valid. Silakan masukkan 'y' untuk lanjut atau 'n' untuk keluar.");
    }
}

package com.kalkulator;

public class MessagePrinter {
    public static void cetakErrorInputBukanAngka() {
        System.out.println("Error: Input harus berupa angka.");
    }

    public static void cetakErrorRangeAngka() {
        System.out.println("Error: Angka harus dalam rentang -32.768 hingga 32.767.");
    }

    public static void cetakErrorOperator() {
        System.out.println("Error: Operator tidak valid. Hanya +, -, *, /.");
    }

    public static void cetakErrorPembagiNol() {
        System.out.println("Error: Pembagi tidak boleh nol.");
    }

    public static void cetakHasil(double hasil) {
        System.out.println("Hasil: " + hasil);
    }
}

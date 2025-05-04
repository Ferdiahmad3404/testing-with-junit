package com.kalkulator.Input;

import com.kalkulator.Validation.ValidasiOperator;
import com.kalkulator.View.Error.ErrorOperatorInvalid;
import com.kalkulator.View.Information.ViewMasukkanOperator;

import java.util.Scanner;

public class InputOperator {
    public static char getInput(Scanner scanner) {
        Character operator = null;
        while (operator == null) {
            ViewMasukkanOperator.tampilkan();
            char op = scanner.next().charAt(0);
            if (!ValidasiOperator.validasi(op)) {
                ErrorOperatorInvalid.tampilkan();
                continue;
            }
            operator = op;
        }
        return operator;
    }
}

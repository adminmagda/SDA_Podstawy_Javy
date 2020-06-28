package Zadania_Domowe_Podstawy_Javy;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = scanner.nextDouble();

        if (income <= 85528.0) {
            double calculatedTax = income * 0.18 - 556.02;

            if (calculatedTax < 0) {
                calculatedTax = 0;
            }

            System.out.println(calculatedTax);
            ;
        } else {
            System.out.println(14839.02 + 0.32 * (income - 85528.0));
        }
    }
}
package Zadania_Domowe_Podstawy_Javy;

import java.util.Scanner;

public class Plec {

    public static void main(String[] args) {

        System.out.println("Podaj imię");
        Scanner scan = new Scanner(System.in);
        String imie = scan.nextLine();
        System.out.println("Podaj płeć [kobieta/mężczyzna]");
        String plec = scan.nextLine();

        if (plec.equals("kobieta") || plec.equals("Kobieta") || plec.equals("KOBIETA")) {
            System.out.println("Dzień dobry Pani " + imie);
        }

        if (plec.toLowerCase().equals("mężczyzna")) {
            System.out.println("Dzień dobry Panie " + imie);
        }
    }
}

package Zadania_Domowe_Podstawy_Javy;

import java.util.Scanner;

public class PodzielnaPrzez4ILub5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

        if (liczba % 4 == 0 && liczba % 5 == 0) {
            System.out.println("Podana liczba jest podzielna przez 4 i 5");
        } else if (liczba % 4 == 0) {
            System.out.println("Podana liczba jest podzielna przez 4");
        } else if (liczba % 5 == 0) {
            System.out.println("Podana liczba jest podzielna przez 5");
        }


    }
}

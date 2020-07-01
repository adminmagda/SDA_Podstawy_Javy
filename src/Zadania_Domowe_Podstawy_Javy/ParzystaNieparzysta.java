package Zadania_Domowe_Podstawy_Javy;

import java.util.Scanner;

public class ParzystaNieparzysta {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) {
            System.out.println("Podana liczba jest parzysta");
        } else {
            System.out.println("Podana liczba jest nieparzysta");
        }
    }
}

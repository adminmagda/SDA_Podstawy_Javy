package Zadania_Domowe_Podstawy_Javy;

import java.util.Scanner;

public class Imiona {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String imie = scanner.nextLine();

        if (imie.endsWith("a")) {
            System.out.println("Podane imię jest imieniem żeńskim");
        } else {
            System.out.println("Podane imię jest imieniem męskim");
        }
    }
}


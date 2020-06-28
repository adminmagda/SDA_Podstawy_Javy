package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        System.out.println("Hello World!");
        System.err.print("Błąd");
        System.out.println("następny komunikat -> skrót sout");
        */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj swoje imię: ");
        String imie = scanner.nextLine();
        System.out.println("Odczytane imię: " + imie);
        */

        Kwadrat mojKwadrat = new Kwadrat(10);
        //mojKwadrat.a = 10;
        /*
        Scanner scanner = new Scanner(System.in);
        mojKwadrat.a = scanner.nextInt();
        */
        int polePowierzchni = mojKwadrat.policzPole();
        System.out.println("Pole wynosi: " + polePowierzchni);
    }
}

package Zadania_Domowe_Podstawy_Javy.obslugaWyjatkowImiona;

import java.util.Scanner;

public class Imiona {

    public void sprawdzImie () throws ImionaException {

        Scanner scanner = new Scanner(System.in);
        String imie = scanner.nextLine();
        String[] listaWyjatkow = {"Kosma", "Barnaba"};

        for (int i = 0; i < listaWyjatkow.length; i++) {
            if (imie.equals(listaWyjatkow[i])) {
                //System.out.println("Podane imię jest imieniem męskim");
                //break;
                throw new ImionaException("Podano imię męskie kończące się na literę a");
            }
        }
        if (imie.endsWith("a")) {
            System.out.println("Podane imię jest imieniem żeńskim");
        } else {
            System.out.println("Podane imię jest imieniem męskim");
        }
    }
}

/* WYJĄTKI W JAVIE

    1. Wyjątki kontrolowane 'checked exception' - to ja wskazuje kiedy taki wyjątek powinien zostać zgłoszony
    2. Wyjątki niekontrolowane
     */
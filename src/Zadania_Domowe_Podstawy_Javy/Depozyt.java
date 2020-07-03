package Zadania_Domowe_Podstawy_Javy;

import java.util.Scanner;

public class Depozyt {

    public static void main(String[] args) {

        double kwotaDepozytu = 1000.0;
        double miesieczneOprocentowanie = 0.1 / 12;
        double podatekBelki = 0.19;
        double wysokoscPodatkuBelki = 0;

        for (int i = 0; i < 48; i++) {
            double miesiecznyZysk = kwotaDepozytu * miesieczneOprocentowanie;
            System.out.println("Przychód względem poprzedniego miesiąca: " + "depozyt: " + kwotaDepozytu + " (oprocentowanie: " + miesiecznyZysk + ")");
            wysokoscPodatkuBelki = miesiecznyZysk * podatekBelki;
            System.out.println("Wysokość podatku Belki: " + wysokoscPodatkuBelki + " pln");
            kwotaDepozytu = miesiecznyZysk + kwotaDepozytu;
            System.out.println("Suma depozytu w danym miesiącu: " + kwotaDepozytu + " pln");
            System.out.println("");
            }
        System.out.println("Suma końcowa depozytu: " + kwotaDepozytu + "pln");

        }
    }


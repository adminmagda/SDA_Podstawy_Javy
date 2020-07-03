package Zadania_Domowe_Podstawy_Javy;

import java.util.Scanner;

public class Depozyt {

    public static void main(String[] args) {

        double kwotaDepozytu = 1000.0;
        double miesieczneOprocentowanie = 0.1 / 12;
        double podatekBelki = 0.19;
        double wysokoscPodatkuBelki = 0;

        for (int i = 0; i < 48; i++) {
            System.out.println("Przychód względem poprzedniego miesiąca: " + "depozyt: " + kwotaDepozytu + " (oprocentowanie: " + kwotaDepozytu * miesieczneOprocentowanie + ")");
            wysokoscPodatkuBelki = kwotaDepozytu * miesieczneOprocentowanie * podatekBelki;
            System.out.println("Wysokość podatku Belki: " + wysokoscPodatkuBelki + " pln");
            kwotaDepozytu = kwotaDepozytu * miesieczneOprocentowanie + kwotaDepozytu;
            System.out.println("Suma depozytu w danym miesiącu: " + kwotaDepozytu + " pln");
            System.out.println("");
            }
        System.out.println("Suma końcowa depozytu: " + kwotaDepozytu + "pln");

        }
    }


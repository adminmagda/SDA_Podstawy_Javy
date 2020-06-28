package Zadania_Domowe_Podstawy_Javy;

import java.util.Scanner;

public class Suma_trzech_liczb {

    public static void main(String[] args) {

        int[] pustaTablica = new int[3];
        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < pustaTablica.length; i++) {
            int licznik = i + 1;
            System.out.println("Podaj liczbę numer " + licznik);
            pustaTablica[i] = scan.nextInt();
        }

        int suma = 0;
        for (int element : pustaTablica) {
            suma = suma + element;
        }

        System.out.println(suma);

    }
}

package Petle;

public class Tablice_jednowymiarowe {

    public static void main(String[] args) {

        int[] tablica = {1, 5, 6, 2, 3, 5, 10, 2};

        // wyświetlanie tabeli od początku do końca
        // jeśli wpiszę i = 4 zacznie wyświetlać elementy od 5 do końca itp.
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }
        System.out.println("-------------");
        System.out.println("");

        for (int element : tablica) {
            System.out.println(element);
        }
        System.out.println("-------------");

        // wyświetlanie tabeli od końca do początku
        for (int i = tablica.length - 1; i >= 0 ; i--) {
            System.out.println(tablica[i]);

        }

    }
}

package Zadania_Domowe_Podstawy_Javy;

public class PotegiPiatki {

    public static void main(String[] args) {

        int wynik = 1;

        int[] pustaTablica = new int[10];
        for (int i = 0; i < pustaTablica.length; i++) {
            wynik = wynik * 5;
            pustaTablica[i] = wynik;
            System.out.println(pustaTablica[i]);
        }
    }
}

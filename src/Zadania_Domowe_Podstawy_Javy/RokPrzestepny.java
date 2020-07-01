package Zadania_Domowe_Podstawy_Javy;

import java.util.Scanner;

public class RokPrzestepny {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rok = scanner.nextInt();

        if (rok % 4 ==0 && rok % 100 != 0 || rok % 400 == 0) {
            System.out.println(rok + " - jest rokiem przestępnym");
        } else {
            System.out.println(rok + " - nie jest rokiem przestępnym");
        }
    }
}

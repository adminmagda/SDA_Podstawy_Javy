package com.company;

public class Warunki {

    public static void main(String[] args) {
        System.out.println("Początek programu");

        if (true){
            System.out.println("Jestem w ifie");
        }

        //to co poniżej nie powinno się wyświetlić bo przyjmujemy wartość FALSE --> if (false)
        // żeby się wyświetliło możemy użyć znaku negacji! --> if (!false)
        if (false) {
            System.out.println("Coś tam");
        }

        System.out.println("Koniec programu");

    }
}

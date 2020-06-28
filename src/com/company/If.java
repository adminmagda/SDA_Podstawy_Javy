package com.company;

import java.awt.*;

public class If {
    public static void main(String[] args) {
        System.out.println("Początek programu");

        int a = 15;
        int b = 20;
        if (a > b) {
            System.out.println("a mniejsza od b");
        }
        else {
            System.out.println("a nie jest mniejsze od b");
        }

        if (a == b) {
            System.out.println("a równe b");
        }

        if (a != b) {
            System.out.println("a jest różne od b");
        }

        if (a != b) {
            System.out.println("a różne od b");
            System.out.println("a jest na prawdę różne od b");
        }
    }
}

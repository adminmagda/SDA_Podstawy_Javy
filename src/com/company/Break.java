package com.company;

public class Break {
    public static void main(String[] args) {
        int zmienna = 1;
        switch (zmienna) {
            case 1:
            case 6:
                System.out.println("Zmienna rówa 1");
                break;
            case 3:
                System.out.println("Zmienna równa 3");
                break;
            default:
                System.out.println("Brak dopasowania");
        }
    }
}
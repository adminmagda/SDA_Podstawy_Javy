package com.company;

public class Kalkulator {

    public static void main(String[] args) {
       long a = 5L;
       long b = 6L;

        dodawanie(a, b);
        dodawanie(1L,20L);
        dodawanie(1.2f, 2.33f);
        // a: i b: to podpowiedź IJ - tego nie wpisuję z ręki

    }

    public static void dodawanie(long a, long b) {
        long result = a + b;
        System.out.println(a + " + " + b + " =" + result);
        System.out.println(result);
    }

    public static void dodawanie(float a, float b) {
        float result = a + b;
        System.out.println(a + " + " + b + " =" + result);
        System.out.println(result);
    }

    public void odejmowanie(int a, int b) {
        int result = a - b;
        System.out.println(a + " - " + b + " = " + result);
        System.out.println(result);
    }

    public void zwiekszOJeden(int a) {
        //przypisanie wyniku do nowej zmiennej
        int result = a + 1;
        showResultAndA(a, result);

        showResultAndA(a, result);
        // zwiększenie wartości o jeden
        a = a + 1;
        showResultAndA(a, result);

        // zwięksenie wartości o jeden - krótszy zapis
        a += 1;
        showResultAndA(a, result);

        // zwiększenie wartości zmiennej o jeden - najkrótszy zapis
        showResultAndA(a++, result);
        showResultAndA(++a, result);
    }

    private void showResultAndA(int a, int result) {
        System.out.println("result = " + result);
        System.out.println("a = " + a);
        System.out.println("---------");
    }
}
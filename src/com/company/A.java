package com.company;

public class A {
    private static int statyczneA; //statyczneA zaczyna się od 0; 0 to domyślna wartość dla int

    public static void main(String[] args) {
        int a = 5;
        System.out.println(funkcja(a));
        System.out.println(funkcja(a));
        System.out.println(a);
    }

    public static int funkcja(int x) {
        statyczneA++; //w tym momencie do statycznego A dodaje się 1
        return statyczneA + x;
    }
}
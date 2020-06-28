package dzien4.Kolekcje;

import java.util.LinkedList;
import java.util.Queue;

public class Kolejka {

    public static void main(String[] args) {
        Queue<String> kolejka = new LinkedList<>();
        kolejka.add("John Lenon");
        kolejka.add("Henryk IX");
        kolejka.add("Donald Trump");
        while (!kolejka.isEmpty()) {
            System.out.println(kolejka.remove());
        }
        System.out.println("Ile zostało: " + kolejka.size());
    }
}

package dzien4.Kolekcje;

import java.util.TreeSet;

public class Zbior {
    public static void main(String[] args) {
        TreeSet<String> zbior = new TreeSet<>();
        zbior.add("Magda");
        zbior.add("Tomek");
        zbior.add("Tomek");
        zbior.add("Magda2");
        zbior.add("Maja");
        //wyświetli 4 elementy, bo Tomek się powtarza
        System.out.println("Ilość elementów w zbiorze: " + zbior.size());
        int index = 1;
        //elementy wyświetlają się alfabetycznie, numerycznie
        for (String imie : zbior) {
            System.out.println(index + ": " + imie);
            index++;
        }
        //sprawdzenie czy zbiór zawiera dany element
        if (zbior.contains("Magda")) {
            System.out.println("Zawiera Magdę");
        }
    }
}

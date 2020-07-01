package posilek;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    List<Posilek> listaPosilkow = new ArrayList<>();

    public void wyswietlMenu() {
        for (Posilek posilek: listaPosilkow) {
            System.out.println(posilek.nazwaPotrawy
                    + ": składa się z "
                    + posilek.listaSkladnikow.size()
                    + " składników, kraj pochodzenia - "
                    + posilek.regionPochodzenia
                    + " "
                    + posilek.wartoscEnergetyczna
                    + " kcal.");
            System.out.println("Lista składników:");
            for (String skladnik: posilek.listaSkladnikow) {
                System.out.println(skladnik);
            }
            System.out.println("Lista alergenów:");
            for (String alergen: posilek.listaAlergenow) {
                System.out.println(alergen);
            }
            System.out.println("");

        }
    }

    public void dodajPosilek(Posilek posilek) {
        listaPosilkow.add(posilek);
    }
}

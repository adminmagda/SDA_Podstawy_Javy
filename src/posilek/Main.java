package posilek;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();

        Posilek omlet = new Omlet();
        omlet.nazwaPotrawy = "OMLET";
        omlet.wartoscEnergetyczna = 231;
        omlet.regionPochodzenia = "Francji";
        //omlet.liczbaSkladnikow = 4;
        omlet.listaSkladnikow.add("Jaja surowe");
        omlet.listaSkladnikow.add("Ser");
        omlet.listaSkladnikow.add("Masło");
        omlet.listaAlergenow.add("Jaja");

        Posilek pasztet = new Pasztet();
        pasztet.nazwaPotrawy = "PASZTET";
        pasztet.wartoscEnergetyczna = 295;
        pasztet.regionPochodzenia = "Węgry";
        //pasztet.liczbaSkladnikow = 10;
        pasztet.listaSkladnikow.add("Wątróbka drobiowa");
        pasztet.listaSkladnikow.add("Słonina");
        pasztet.listaSkladnikow.add("Jajo surowe");
        pasztet.listaSkladnikow.add("Karkówka");
        pasztet.listaAlergenow.add("Jaja");

        Posilek watrobka = new Watrobka();
        watrobka.nazwaPotrawy = "WATROBKA";
        watrobka.wartoscEnergetyczna = 259;
        watrobka.regionPochodzenia = "Polska";
        //watrobka.liczbaSkladnikow = 5;
        watrobka.listaSkladnikow.add("Watróbka drobiowa");
        watrobka.listaSkladnikow.add("Cebula");
        watrobka.listaSkladnikow.add("Masło");
        watrobka.listaAlergenow.add("Laktoza");


        menu.dodajPosilek(omlet);
        menu.dodajPosilek(pasztet);
        menu.dodajPosilek(watrobka);

        menu.wyswietlMenu();
    }

}

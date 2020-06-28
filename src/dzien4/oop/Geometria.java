package dzien4.oop;

import java.util.ArrayList;
import java.util.List;

public class Geometria {
    public static void main(String[] args) {
        Figura malyKwadrat = new Kwadrat(5.0);
        wyswietlDane(malyKwadrat);

        //zapis polimorficzny - zamisat Prostokąt piszę Figura ????????
        Figura duzyProstokat = new Prostokat(150.0, 250.0);
        wyswietlDane(duzyProstokat);

        Figura trojkatHerona = new Trojkat(4.0, 5.0, 7.0);
        wyswietlDane(trojkatHerona);

        Figura[] figury = new Figura[4];
        figury[0] = new Kwadrat(1.0);
        figury[1] = new Prostokat(100.0, 2.0);
        figury[2] = new Kwadrat(100.0);
        figury[3] = new Trojkat(4.0, 5.0, 7.0);

        for (Figura figuraZTabeli : figury) {
            wyswietlDane(figuraZTabeli);
        }
        List<Figura> listaFigur = new ArrayList<>();
        listaFigur.add(new Kwadrat(1.2));
        listaFigur.add(new Kwadrat(10.5));
        listaFigur.add(new Prostokat(100.0, 20.1));
        listaFigur.add(new Trojkat(4.0, 5.0, 7));

        for (Figura figuraZListy : listaFigur) {
            wyswietlDane(figuraZListy);
        }

        System.out.println("Na liście jest dokładnie: " + listaFigur.size());
        Figura usunietyElement = listaFigur.remove(1);
        wyswietlDane(usunietyElement);
        System.out.println("Na liście pozostało: " + listaFigur.size());
        wyswietlDane(listaFigur.get(0));

    }

    private static void wyswietlDane(Figura figuraGeometryczna) {
        System.out.println(figuraGeometryczna.nazwaFigury());
        System.out.println(figuraGeometryczna.liczbaBokow);
        System.out.println("Obwód = " + figuraGeometryczna.obwod());
        System.out.println("Pole = " + figuraGeometryczna.polePowierzchni());
        System.out.println("--------------");
        System.out.println("");
    }

    }

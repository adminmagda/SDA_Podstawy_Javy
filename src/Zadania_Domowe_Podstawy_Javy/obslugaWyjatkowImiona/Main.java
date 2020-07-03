package Zadania_Domowe_Podstawy_Javy.obslugaWyjatkowImiona;

public class Main {

    public static void main(String[] args) {
        Imiona imiona = new Imiona();
        try {
            imiona.sprawdzImie();
        } catch (ImionaException e) {
            System.out.println("Przechwyciliśmy wyjątek - podane imię jest imieniem męskim kończącym się na literę a");
        }
    }
}

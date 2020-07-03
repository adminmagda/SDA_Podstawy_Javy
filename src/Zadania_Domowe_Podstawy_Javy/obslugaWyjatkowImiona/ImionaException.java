package Zadania_Domowe_Podstawy_Javy.obslugaWyjatkowImiona;

public class ImionaException extends Exception {

    // konstruktor, w którym podaję komunikat błędu
    public ImionaException(String message) {
        super(message);
    }

    // konstruktor, w którym tworzę wyjątek z komunikatem błędu ale dołączam do niego poprzedni przechwycony wyjątek
    public ImionaException(String message, Throwable cause) {
        super(message, cause);
    }
}

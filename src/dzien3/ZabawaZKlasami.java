package dzien3;

public class ZabawaZKlasami {
    public static void main(String[] args) {

        Book harryPotter = new Book (); //obiekt klasy Book
        harryPotter.title = "Harry Potter";
        harryPotter.author = "J.K.Rowling";
        harryPotter.pageNumber = "123";
        harryPotter.read();

        Book domyslna = new Book();
        System.out.println(domyslna.toString());

        Book inicjalizowanyZParametrami = new Book("Kubuś Puchatek", "Przygoda", "212654", "123");
        System.out.println(inicjalizowanyZParametrami.toString());

        Book mojPrzyklad = new Book("Magdalena Bacewicz", "Przykład konstruktora parametrycznego");
        System.out.println(mojPrzyklad.toString()); //nie rozumiem po co pisac w tym miejscu .toString()

    }
}

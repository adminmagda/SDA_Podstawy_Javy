package Petle;

public class Ciagi_znakowe_String {

    public static void main(String[] args) {

        String str1 = new String("Test");
        String str2 = new String("Test");
        System.out.println(str1);
        System.out.println(str2);

        if (str1 == str2) {
            System.out.println("Moje Stringi są takie same");
        } else {
            System.out.println("Moje Stringi są różne");
        }

        //zmieniłam == na .equals --> zgodnie z podpowiedzią po najechaniu kursorem na ==
        // Stringi powinno porównywać się .equals bo == nie zadziała poprawnie
        if (str1.equals(str2)) {
           System.out.println("Moje Stringi są takie same");
        } else {
           System.out.println("Moje Stringi są różne");
            }

        // długość znaków
        System.out.println("Długość stringa: " + str1.length());
        // sprawdzenie czy pierwszy string zaczyna sie od Te z duzej litery, gdybym wpisala te juz by zwrocilo false
        System.out.println(str1.startsWith("Te"));
        //zmiana na male litery i sprawdzenie czy zaczyna sie od duzej litery
        System.out.println(str1.toLowerCase().startsWith("Te"));
        //charAt() - co znajduje sie pod itym znakiem Stringa
        System.out.println(str1.toUpperCase().charAt(3));

        //przykład do debugera (result3= 'S' 83 to kod ASCII http://www.lo8.poznan.pl/belferek/klasa1/budkom/lit.html
        String result1 = str1.toUpperCase();
        String result2 = result1.toUpperCase();
        char result3 = result2.charAt(2);
        System.out.println(result3);

        // printf
        System.out.printf("100.0 / 3.0 = %5.2f", 100.0 / 3.0); // wynikiem będzie liczba zmiennoprzecinkowa składająca się z 5-ciu znaków i 2 cyfr po przecinku
        System.out.println();
        System.out.printf("100 / 3 = %4d", 100 / 3); // wynikiem będzie liczba całkowita zajmująca 4 znaki - wynik dzielenia będzie zaokrąglony

        }
}

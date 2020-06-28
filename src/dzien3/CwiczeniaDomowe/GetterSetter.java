package dzien3.CwiczeniaDomowe;

public class GetterSetter {

    //Getter i Setter - dla wybranych pól będzie możliwa modyfikacja wartości przez klienta

    private String rozmiar;
    private int liczbaPrzezutek;
    private String kolor;
    private String marka;

    public GetterSetter() {
    }

    //getter - pobiera aktualną wartość pola i ją zwraca klientowi
    public String getMarka() {
        return marka;
    }
    //setter - pozwala klientowi ustawić nową wartość pola
    public void setMarka(String marka) {
        this.marka = marka;
    }
}

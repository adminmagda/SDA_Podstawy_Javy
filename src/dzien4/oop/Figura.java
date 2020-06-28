package dzien4.oop;

public abstract class Figura {

    public LiczbaBokow liczbaBokow;

    abstract double polePowierzchni();
    abstract double obwod();

    public String nazwaFigury() {
        return getClass().getSimpleName();
    }
}

package dzien4.oop;

public class Prostokat extends Figura {
    private double bokA;
    private double bokB;

    public Prostokat(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.liczbaBokow = LiczbaBokow.CZWOROBOK;
    }

    @Override
    public double polePowierzchni() {
        return bokA * bokB;
    }

    @Override
    public double obwod() {
        return 2 * bokA + 2 * bokB;
    }
}

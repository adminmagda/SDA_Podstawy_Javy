package dzien3.oop;

public class Prostokat implements Figura {
    private double bokA;
    private double bokB;

    public Prostokat(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
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

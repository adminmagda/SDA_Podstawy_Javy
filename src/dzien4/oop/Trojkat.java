package dzien4.oop;

public class Trojkat extends Figura {

    private double bokA;
    private double bokB;
    private double bokC;

    public Trojkat(double bokA, double bokB, double bokC) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
        this.liczbaBokow = LiczbaBokow.TROJKAT;
    }

    @Override
    public double polePowierzchni() {
        double polowaObwodu = obwod() / 2;
        return Math.sqrt(polowaObwodu * (polowaObwodu - bokA) * (polowaObwodu - bokB) * (polowaObwodu - bokC));
    }

    @Override
    public double obwod() {
        return bokA + bokB + bokC;
    }
}


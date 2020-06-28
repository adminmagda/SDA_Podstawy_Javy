package dzien3.oop;

public class Kwadrat implements Figura {
    //najechać na podkreślenie i nacisnij implement methods
    private double dlugoscBoku;

    public Kwadrat(double dlugoscBoku) {
        this.dlugoscBoku = dlugoscBoku;
    }

    @Override
    public double polePowierzchni() {
        return Math.pow(this.dlugoscBoku,2); //Math - tablice matematyczne
    }

    @Override
    public double obwod() {
        return 4 * this.dlugoscBoku;
    }
}

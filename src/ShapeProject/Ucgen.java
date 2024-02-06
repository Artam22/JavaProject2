package ShapeProject;

import ShapeProject.IIslemler;

public class Ucgen implements IIslemler {

    private double Kenar1;
    private double Kenar2;
    private double Kenar3;

    public Ucgen(double kenar1, double kenar2, double kenar3) {
        setKenar1(kenar1);
        setKenar2(kenar2);
        setKenar3(kenar3);
    }

    public double getKenar1() {
        return Kenar1;
    }

    public void setKenar1(double kenar1) {
        Kenar1 = kenar1;
    }

    public double getKenar2() {
        return Kenar2;
    }

    public void setKenar2(double kenar2) {
        Kenar2 = kenar2;
    }

    public double getKenar3() {
        return Kenar3;
    }

    public void setKenar3(double kenar3) {
        Kenar3 = kenar3;
    }

    @Override
    public double alan() {
        double s= (this.Kenar1+this.Kenar2+this.Kenar3)/2;
        return Math.sqrt(s*(s-this.Kenar1)*(s-this.Kenar2)*(s-this.Kenar3));
    }

    @Override
    public double cevre() {
        return (this.Kenar1+this.Kenar2+this.Kenar3);
    }
}

package ShapeProject;

import ShapeProject.IIslemler;

public class Daire implements IIslemler {

    private double r;

    public Daire(double r) {
        setR(r);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double alan() {
        return Math.PI*r*r;
    }

    @Override
    public double cevre() {
        return Math.PI*2*r;

    }
}

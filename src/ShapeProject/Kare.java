package ShapeProject;

public class Kare implements IIslemler {
    // TODO Bu class doldurunuz

    private int kKenar;

    public Kare(int kKenar) {
        setkKenar(kKenar);
    }

    @Override
    public double cevre() {
        return this.kKenar * 4;
    }

    @Override
    public double alan() {
        return this.kKenar * this.kKenar;
    }


    public int getkKenar() {
        return kKenar;
    }

    public void setkKenar(int kKenar) {
        this.kKenar = kKenar;
    }
}

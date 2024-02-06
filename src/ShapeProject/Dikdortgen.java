package ShapeProject;

public class Dikdortgen implements IIslemler{

    private int kKenar;
    private int uKenar;

    public Dikdortgen(int kKenar, int uKenar) {
        setkKenar(kKenar);
        setuKenar(uKenar);
    }

    @Override
    public double cevre() {
        return (uKenar+kKenar) * 2;
    }

    @Override
    public double alan() {
        return this.uKenar * this.kKenar;
    }

    public int getkKenar() {
        return kKenar;
    }

    public void setkKenar(int kKenar) {
        this.kKenar = kKenar;
    }

    public int getuKenar() {
        return uKenar;
    }

    public void setuKenar(int uKenar) {
        this.uKenar = uKenar;
    }

    // TODO Bu class doldurunuz
}

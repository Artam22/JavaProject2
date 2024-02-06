package ShapeProject;

public class Kare implements IIslemler {

    int kKenar;

    public Kare(int kKenar) {
        this.kKenar = kKenar;
    }

    @Override
    public double cevre() {

        return kKenar * 4;
    }

    @Override
    public double alan() {

        return kKenar * kKenar;
    }
    // TODO Bu class doldurunuz






}

package ShapeProject;

public class Runner {
    public static void main(String[] args) {

        // TODO Bu class doldurunuz
        Kare kare = new Kare(5);

        System.out.println("kare.cevre() = " + kare.cevre());
        System.out.println("kare.alan() = " + kare.alan());

        Dikdortgen dikdortgen = new Dikdortgen(7,10);
        System.out.println("dikdortgen.cevre() = " + dikdortgen.cevre());
        System.out.println("dikdortgen.alan() = " + dikdortgen.alan());

    }
}

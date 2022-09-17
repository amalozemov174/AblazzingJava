package Task1Advanced;

public class App {

    public static void main(String[] args) {
        Smelable smelable[] = new Smelable[3];
        Flowering flowering[] = new Flowering[2];
        smelable[0] = new Spruce();
        smelable[1] = new Pine();
        smelable[2] = new Rose();
        flowering[0] = new Rose();
        flowering[1] = new Fern();
        for (Smelable smell : smelable) {
            smell.smell();
        }
        for (Flowering flower : flowering) {
            flower.blossom();
        }
    }

}

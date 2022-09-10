package Task1Advanced;

public class Spruce extends Tree implements Smelable{
    @Override
    public void smell() {
        System.out.println("сосна : умеет пахнуть");
    }
}

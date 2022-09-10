package Task1Advanced;

public class Rose extends Plant implements  Flowering, Smelable{
    @Override
    public void blossom() {
        System.out.println("роза: умеет цвести");
    }
    @Override
    public void smell() {
        System.out.println("роза: умеет пахнуть");
    }
}

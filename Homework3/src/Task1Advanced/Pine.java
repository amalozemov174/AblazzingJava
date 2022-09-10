package Task1Advanced;

public class Pine extends Tree implements Smelable{
    @Override
    public void smell() {
        System.out.println("ель : умееть пахнуть");
    }
}

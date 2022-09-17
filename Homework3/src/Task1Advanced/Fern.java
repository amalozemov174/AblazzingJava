package Task1Advanced;

public class Fern extends Plant implements Flowering{
    @Override
    public void blossom() {
        System.out.println("папоротник: умеет цвести");
    }
}

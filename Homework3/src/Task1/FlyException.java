package Task1;

public class FlyException extends Throwable {

    public FlyException(String s) {
        System.out.println("Ошибка:" + s);
    }
}

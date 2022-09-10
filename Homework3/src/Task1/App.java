package Task1;

public class App {

    public static void main(String[] args) {
        Duck duck1 = new Duck(false);
        Duck duck2 = new Duck(true);
        Airplane airplane1 = new Airplane(10);
        Airplane airplane2 = new Airplane(-1);
        try {
            duck1.fly();
        }
        catch (FlyException e){
        }
        try {
            duck2.fly();
        }
        catch (FlyException e){

        }
        try {
            airplane1.fly();
        }
        catch (FlyException e){

        }
        try {
            airplane2.fly();
        }
        catch (FlyException e){

        }


    }

}

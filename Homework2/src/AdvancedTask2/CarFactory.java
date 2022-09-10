package AdvancedTask2;

public class CarFactory {

    public static Lada createLada(){
        return new Lada();
    }

    public static Toyota createToyota(){
        return new Toyota();
    }
}

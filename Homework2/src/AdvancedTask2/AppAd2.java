package AdvancedTask2;

public class AppAd2 {

    public static void main(String[] args) {
        Car[] cars = new Car[40];

        for (int i = 0; i < 20; i++){
            cars[i] = CarFactory.createToyota();
        }

        for (int i = 20; i < 40; i++){
            cars[i] = CarFactory.createLada();
        }

        for (Car c : cars) {
            if(c instanceof Toyota){
                ((Toyota) c).getMusic();
            }
            else {
                ((Lada) c).getDamage();
            }
        }
    }
}

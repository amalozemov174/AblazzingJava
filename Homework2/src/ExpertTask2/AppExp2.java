package ExpertTask2;

public class AppExp2 {
    public static void main(String[] args) {
        CarShop carShop = new CarShop(new Car(5000));
        CarShop carShop1 = new CarShop(new Car(-5000));

        carShop.saleCar();
        System.out.println("");
        carShop1.saleCar();
    }
}

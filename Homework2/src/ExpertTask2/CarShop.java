package ExpertTask2;

public class CarShop {
    private Car car;

    public CarShop(Car car){
        this.car = car;
    }

    public void saleCar(){
        try{
            System.out.println("Здравствуй клиент, цена этого авто");
            car.getPrice();
            System.out.println("Хочешь купить авто?");
        }
        catch (RuntimeException e){
            System.out.println("Давайте посмотрим другое авто?");
        }
    }

}

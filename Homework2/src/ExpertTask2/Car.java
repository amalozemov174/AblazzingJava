package ExpertTask2;

public class Car {

    private int price;

    public Car(int price){
        this.price = price;
    }

    public void getPrice() {
        if(price <= 0){
            System.out.println("неизвестна мне");
            throw new RuntimeException();
        }
        else {
            System.out.println(price);
        }
    }
}

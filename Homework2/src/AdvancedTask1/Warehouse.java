package AdvancedTask1;

public class Warehouse {

    private final Vodka[] vodkaAmount;

    public Warehouse(){
        vodkaAmount = new Vodka[100];
        for(int i = 0; i< vodkaAmount.length; i++){
            vodkaAmount[i] = new Vodka();
        }
    }

    public void addVodka(Vodka vodka){
        for(Vodka c : vodkaAmount){
            if(c == null){
                c = vodka;
            }
            else {
                System.out.println("На складе нет места");
            }
        }

    }

    public void releaseVodka(){
        for(int i = 0; i< vodkaAmount.length; i++){

            if(i == (vodkaAmount.length - 1)){
                vodkaAmount[i] = null;
                break;
            }
            else if(i == 0){
                if(vodkaAmount[i] == null){
                    System.out.println("Склад пуст");
                }
                if(vodkaAmount[i + 1] == null){
                    vodkaAmount[i] = null;
                    break;
                }
            }
            else if(vodkaAmount[i + 1] == null){
                vodkaAmount[i] = null;
                break;
            }


        }
    }

    public Vodka[] getVodkaAmount() {
        return vodkaAmount;
    }
}

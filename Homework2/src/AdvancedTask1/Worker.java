package AdvancedTask1;

public class Worker {

    private int damageCount = 0;
    private final String name;

    public Worker(String name){
        this.name = name;
    }

    private void addDamagedCount(){
        damageCount++;
    }

    private void showDamagedGoods(){
        System.out.println(this.name + ": " + "Работник повредил " + damageCount + " бутылок");
    }

    public void getItem(Warehouse item){
        item.releaseVodka();
        System.out.println(this.name + ": " + "Ура я испортил водку!");
        addDamagedCount();
        showDamagedGoods();
    }

}

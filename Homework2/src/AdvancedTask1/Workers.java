package AdvancedTask1;

public class Workers {

    private final Worker[] workers;

    public Workers(){
        workers = new Worker[3];
        for(int i = 0; i< workers.length; i++){
            workers[i] = new Worker("Работник" + i);
        }
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void getItemsFromwarehouse(Warehouse warehouse){
        for(Worker w : workers){
            w.getItem(warehouse);
        }
    }
}

package Task2advanced;

public class Shop {
    private Worker worker;

    public Shop(Worker worker){
        this.worker = worker;
    }
    public Worker getWorker() {
        return worker;
    }
    public void setWorker(Worker workers) {
        this.worker = workers;
    }
}

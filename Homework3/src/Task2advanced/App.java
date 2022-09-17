package Task2advanced;

public class App {

    public static void main(String[] args) {
        Watch watchWork = new Watch(false);
        Watch watchBrok = new Watch(true);
        Worker worker1 = new Worker(watchWork);
        Worker worker2 = new Worker(watchBrok);
        Shop shop1 = new Shop(worker1);
        Shop shop2 = new Shop(worker2);
        Shop[] shops = new Shop[2];
        shops[0] = shop1;
        shops[1] = shop2;
        Brand brand = new Brand(shops);

        for(Shop shop : brand.getShops()){
            try {
                shop.getWorker().getWatch().tick();
            }
            catch (WatchBrokenError e){

            }
        }
    }
}

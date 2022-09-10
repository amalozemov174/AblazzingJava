package Task2advanced;

public class Brand {
    private Shop[] shops;

    public Brand(Shop[] shops){
        this.shops = shops;
    }

    public Shop[] getShops() {
        return shops;
    }

    public void setShops(Shop[] shops) {
        this.shops = shops;
    }
}

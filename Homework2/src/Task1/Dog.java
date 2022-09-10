package Task1;

public class Dog {
    private int height;
    private String color;

    public Dog(int height, String color){
        this.height = height;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

package Task1;

public class Duck implements Flyable{
    private boolean isInjured;

    public Duck(boolean isInjured){
        this.isInjured = isInjured;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean isInjured){
        this.isInjured = isInjured;
    }


    @Override
    public void fly() throws FlyException {
        if(isInjured){
            throw new FlyException("утка ранена");
        }
        System.out.println("утка летит");
    }
}

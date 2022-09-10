package Task2advanced;

public class Watch {
    private boolean isBroken;

    public Watch(boolean isBroken){
        this.isBroken = isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void tick() throws WatchBrokenError {
        if(isBroken){
            throw new WatchBrokenError();
        }
        System.out.println("часы тикают");
    }
}

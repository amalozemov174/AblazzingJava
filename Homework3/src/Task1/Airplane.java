package Task1;

public class Airplane implements Flyable {
    private int countPassengers;

    public Airplane(int countPassengers){
        this.countPassengers = countPassengers;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if(countPassengers < 0){
            throw new FlyException("пассажиров в самолете меньше 0");
        }
        System.out.println("самолет летит");
    }
}

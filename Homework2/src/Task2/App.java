package Task2;

public class App {

    public static void main(String[] args) {
        LenovoComputer computerLenovo = new LenovoComputer();
        computerLenovo.on();
        computerLenovo.loadSystem();
        computerLenovo.work();
        computerLenovo.off();

        Computer computer = new Computer();
        computer.on();
        computer.loadSystem();
        computer.work();
        computer.off();

    }

}

package ExpertTask1;

public class AppExp1 {

    public static void main(String[] args) {
        Human human = new Human.HumanBuilder().age(32).name("Петр").weight(80).build();
        human.info();
    }

}

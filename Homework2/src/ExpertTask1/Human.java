package ExpertTask1;

public class Human {
    //возраст, имя, вес
    private int age;
    private String name;
    private int weight;

    private Human(){

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void info(){
        System.out.println(name + " - возраст " +  age + ",  " + "вес " + weight);
    }

    public static class HumanBuilder{
        private Human human;

        public HumanBuilder() {
            human = new Human();
        }

        public HumanBuilder age(int age){
            human.setAge(age);
            return this;
        }

        public HumanBuilder name(String name){
            human.setName(name);
            return this;
        }

        public HumanBuilder weight(int weight){
            human.setWeight(weight);
            return this;
        }

        public Human build(){
            return human;
        }

    }
}

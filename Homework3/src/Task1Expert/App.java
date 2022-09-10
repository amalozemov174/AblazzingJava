package Task1Expert;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<Integer, Map<String, String[]>> data = GeneratorExpertHomework.getData();
        Set<String> carsFinish = new HashSet<String>();
        for (Integer region : data.keySet()) {
            Map<String, String[]> allCars = data.get(region);
            for(String inout : allCars.keySet()){
                String[] regionCars = allCars.get(inout);
                for(String car : regionCars){
                    if(car.contains("М") && car.contains("АВ") && !carsFinish.contains(car)){
                        carsFinish.add(car);
                    }
                }
            }
        }
        System.out.println(carsFinish);
        System.out.println(carsFinish.size());

    }
}

package taskExpert;

import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        String path = "src\\resourceExpert\\";
        try {
            DataGenerator.createReports(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ///Task1
        ArrayList<Shop> shops = Shop.loadReports("src\\resourceExpert\\");
        for(Shop shop : shops){
            if(Pyterochka.class.equals(shop.getClass())){
                System.out.println(shop.getDebitbyMonth());
            }
        }


        ///Task2
        for(Shop shop : shops){
            if(Pyterochka.class.equals(shop.getClass())) {
                double res = 0;
                for (Debit debits : shop.debits) {
                    res += debits.getOutcome();
                }
                System.out.println("Расходы Pyterochka за весь период:" + res);
            }
            else if(Perekrestok.class.equals(shop.getClass())) {
                double res = 0;
                for (Debit debits : shop.debits) {
                    res += debits.getOutcome();
                }
                System.out.println("Расходы Perekrestok за весь период:" + res);
            }
            else if(Ydoma.class.equals(shop.getClass())) {
                double res = 0;
                for (Debit debits : shop.debits) {
                    res += debits.getOutcome();
                }
                System.out.println("Расходы Ydoma за весь период:" + res);
            }
            else if(Okey.class.equals(shop.getClass())) {
                double res = 0;
                for (Debit debits : shop.debits) {
                    res += debits.getOutcome();
                }
                System.out.println("Расходы Okey за весь период:" + res);
            }
        }
    }
}

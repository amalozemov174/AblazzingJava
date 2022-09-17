package taskExpert;

import java.io.*;
import java.text.DateFormat;
import java.util.*;

public abstract class Shop {

    ArrayList<Debit> debits;
    public Shop() {
        debits = new ArrayList<Debit>();
    }

    public String getDebitbyMonth(){
        HashMap<Integer, Double> debitRes = new HashMap<>();
        String res = "";
        for (Debit debit : debits) {
            Integer month = Integer.parseInt(debit.getDate().split("[.]")[1]);
            if(debitRes.keySet().contains(month)) {
                //debitRes.put(debitRes.get(month) + debit.getIncome() + debit.getOutcome())
                Double old = debitRes.get(month);
                Double newValue = (Double)debitRes.get(month) + (Double)debit.getIncome() - (Double)debit.getOutcome();
                debitRes.replace(month, old, newValue);
            }
            else {
                debitRes.put(month, debit.getIncome() - debit.getOutcome());
            }
        }
        for(Integer month : debitRes.keySet()){
            res += month + ".2012: " + debitRes.get(month) + "\n";
        }
        return res;
    }

    public static ArrayList<Shop> loadReports(String path){
        ArrayList<Shop> res = new ArrayList<Shop>();
        Pyterochka pyterochka = new Pyterochka();
        Perekrestok perekrestok =  new Perekrestok();
        Ydoma ydoma = new Ydoma();
        Okey okey = new Okey();
        res.add(pyterochka);
        res.add(perekrestok);
        res.add(ydoma);
        res.add(okey);
        File[] files = new File(path).listFiles();
        for(File file : files) {
            ArrayList<String> tmp = readFile(file.getPath());
            for(String fileContent : tmp){
                String[] splitString = fileContent.split(";");
                String shopName = splitString[0];
                String income = splitString[1];
                String outcome = splitString[2];
                String date = splitString[3];
                switch (shopName){
                    case "pyterochka":
                        res.get(0).addDebittoShop(new Debit(Double.parseDouble(income), Double.parseDouble(outcome), date.replace("/", ".")));
                        break;
                    case "perekrestok":
                        res.get(1).addDebittoShop(new Debit(Double.parseDouble(income), Double.parseDouble(outcome), date.replace("/", ".")));
                        break;
                    case "ydoma":
                        res.get(2).addDebittoShop(new Debit(Double.parseDouble(income), Double.parseDouble(outcome), date.replace("/", ".")));
                        break;
                    case "okey":
                        res.get(3).addDebittoShop(new Debit(Double.parseDouble(income), Double.parseDouble(outcome), date.replace("/", ".")));
                        break;
                }
            }
        }
        return res;
    }

    private static ArrayList<String> readFile(String path) {
        ArrayList<String> res = new ArrayList<>();
        int count = 0;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            while (bufferedReader.ready()) {
                if(count == 0){
                    bufferedReader.readLine();
                }
                else {
                    res.add(bufferedReader.readLine());
                }
                count++;
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }

    public void addDebittoShop(Debit debit){
        debits.add(debit);
    }

}

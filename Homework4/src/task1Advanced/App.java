package task1Advanced;

import java.io.*;
import java.util.Random;

public class App {

    public static void main(String[] args) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\resource\\reportAdvanced.txt"))) {
            bufferedWriter.write("incomes" + ";" + "outcomes" + "\n");
            FinancialRecord financialRecord[] = new FinancialRecord[10];
            for (int i = 0; i < 10; i++) {
                financialRecord[i] = new FinancialRecord(new Random().nextInt(10000), new Random().nextInt(10000));
                financialRecord[i].writeFinancialRecord(bufferedWriter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        int incomes = 0;
        int outcomes = 0;
        int count = 0;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\resource\\reportAdvanced.txt"))) {
            while (bufferedReader.ready()) {
                if(count == 0){
                    bufferedReader.readLine();
                }
                else {
                    String tmp = bufferedReader.readLine();
                    String [] incomesTmp = tmp.split(";");
                    incomes += Integer.parseInt(incomesTmp[0]);
                    outcomes += Integer.parseInt(incomesTmp[1]);
                }
                count++;
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("общие доходы - " + incomes);
        System.out.println("общие расходы - " + outcomes);
    }

}

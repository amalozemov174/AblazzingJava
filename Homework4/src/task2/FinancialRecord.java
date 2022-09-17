package task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FinancialRecord {

    private int incomes;
    private int outcomes;

    public void setIncomes(int incomes) {
        this.incomes = incomes;
    }

    public void setOutcomes(int outcomes) {
        this.outcomes = outcomes;
    }

    public int getIncomes() {
        return incomes;
    }

    public int getOutcomes() {
        return outcomes;
    }

    public FinancialRecord(int incomes, int outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public void writeFinancialRecord() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\resource\\report.txt"))) {
            bufferedWriter.write("доходы " + incomes + "\n");
            bufferedWriter.write("расходы " + outcomes + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

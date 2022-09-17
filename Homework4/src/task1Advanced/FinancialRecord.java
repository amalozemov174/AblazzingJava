package task1Advanced;

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

    public void writeFinancialRecord(BufferedWriter bufferedWriter) {
        try  {
            bufferedWriter.append(incomes + ";" + outcomes + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

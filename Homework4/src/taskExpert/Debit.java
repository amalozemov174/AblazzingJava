package taskExpert;

import java.util.Date;

public class Debit {

    private double income;
    private double outcome;
    String date;

    public Debit(double income, double outcome, String date){
        this.income = income;
        this.outcome = outcome;
        this.date = date;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setOutcome(int outcome) {
        this.outcome = outcome;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getIncome() {
        return income;
    }

    public double getOutcome() {
        return outcome;
    }

    public String getDate() {
        return date;
    }
}

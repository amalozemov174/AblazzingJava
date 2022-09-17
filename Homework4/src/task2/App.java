package task2;

import java.io.FileReader;

public class App {
    public static void main(String[] args) {
        FinancialRecord financialRecord = new FinancialRecord(500, 300);
        financialRecord.writeFinancialRecord();
    }
}

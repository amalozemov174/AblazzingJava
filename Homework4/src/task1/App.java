package task1;

import java.io.*;

public class App {

    public static void main(String[] args) {
        String res = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\resource\\my_first_file.txt"));
            while(bufferedReader.ready()) {
                res += bufferedReader.readLine() + " ";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(res.trim());
    }

}

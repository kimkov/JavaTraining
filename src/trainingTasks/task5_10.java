package trainingTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class task5_10 {

    public static void currencyEx(int x) {
        int i;
        double result;
        DecimalFormat df = new DecimalFormat("#.##");

        for (i = 1; i <= 20; i++) {
            result = i * x;
            System.out.println("The currency exchange " + i + " dollars is equal to - " + df.format(result) + " national currency");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter currency exchange: ");

        int x = Integer.parseInt(myNum.readLine());

        currencyEx(x);
    }
}

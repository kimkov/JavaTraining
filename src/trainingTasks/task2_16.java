package trainingTasks;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class task2_16 {

    public static String reversN(String x) {
        if (x.length() == 1) {
            return x;
        } else {
            return x.charAt(x.length() - 2) + reversN(x.substring(0, x.length() - 2) + x.charAt(x.length() - 1));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the 3 digits number: ");

        String x = myNum.readLine();

        System.out.println(reversN(x));
    }
}

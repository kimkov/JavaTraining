package trainingTasks;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class task5_28_v {

    public static int multiplyNum(int x) {
        int i;
        double result = 1;
        try {
            if (x <= 0) throw new IOException("This number should be greater than 0!");
            for (i = 1; i <= x; i++) {
                result *= i;
            }
            return (int) result;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number: ");

        int x = Integer.parseInt(myNum.readLine());

        System.out.println(multiplyNum(x));
    }
}

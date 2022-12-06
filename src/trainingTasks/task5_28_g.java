package trainingTasks;

import java.io.InputStreamReader;           // 120
import java.io.IOException;
import java.io.BufferedReader;

public class task5_28_g {

    public static int multiplyNum(int a, int b) {
        int i;
        double result = 1;
        try {
            if ((a <= 0) || (b <= 0)) throw new IOException("All numbers should be greater than 0!");
            for (i = a; i <= b; i++) {
                result *= i;
            }
            return (int) result;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNumA = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number A: ");
        int a = Integer.parseInt(myNumA.readLine());

        BufferedReader myNumB = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number B: ");
        int b = Integer.parseInt(myNumB.readLine());

        System.out.println(multiplyNum(a, b));
    }
}

package trainingTasks;

import java.io.IOException;                 // 118
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class task5_28_b {

    public static int MultiplyNum(int x) {
        try {
            int i;
            double result = 1;
            if (x <= 0) throw new IOException("This number should be greater than 0");
            for (i = x; i <= 15; i++) {
                result *= i;
            }
            return (int) result;
        } catch (IOException e) {
            throw new RuntimeException(e);
//            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");

        int x = Integer.parseInt(myNum.readLine());

        System.out.println(MultiplyNum(x));
    }
}

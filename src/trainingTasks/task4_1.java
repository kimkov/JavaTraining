package trainingTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4_1 {
    public static int mathFunc1(int x) {
        if (x > 0) {
            return (int) Math.pow(Math.sin(x), 2);
        } else {
            return (int) (1 - 2*Math.sin(Math.pow(x, 2)));
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter x - ");

        int x = Integer.parseInt(myNum.readLine());
        System.out.println(mathFunc1(x));
    }
}

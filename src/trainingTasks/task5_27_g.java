package trainingTasks;

import java.io.BufferedReader;                  // 116
import java.io.IOException;
import java.io.InputStreamReader;

public class task5_27_g {

    public static int sumNumAll(int a, int b) {
        int i, result = 0;
        for (i = a; i <= b; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNumA = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number A: ");
        int a = Integer.parseInt(myNumA.readLine());

        BufferedReader myNumB = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number B: ");
        int b = Integer.parseInt(myNumB.readLine());

        System.out.println("Sum of all numbers is: " + sumNumAll(a, b));
    }
}

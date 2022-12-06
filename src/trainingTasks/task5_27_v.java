package trainingTasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class task5_27_v {

    public static int sumNum(int x) {
        int i, result = 0;
        for (i = -10; i <= x; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNumB = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number: ");

        int x = Integer.parseInt(myNumB.readLine());

        System.out.println("Sum of all numbers is: " + sumNum(x));
    }
}

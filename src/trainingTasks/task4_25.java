package trainingTasks;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class task4_25 {

    public static void countFunc(int x) {
        int a = x / 10;
        int b = x % 10;

        if ((a + b > 9) && (a + b <= 99) && (a + b) < x) {
            System.out.println("The sum of its digits has 2 digits and this sum smaller than x!");
        } else if (a + b <= 9) {
            System.out.println("The sum of its digits has only one number!");
        } else {
            System.out.println("X is smaller or equal to sum of its digits");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");

        int x = Integer.parseInt(myNum.readLine());

        countFunc(x);
    }
}

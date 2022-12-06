package trainingTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4_29 {

    public static void numFunc(int x) {
        int a = x / 100;
        int b = x / 10;
        int c = x % 10;

        if (Math.pow(x, 2) == (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3))) {
            System.out.println("(X)2 is equal sum of (A+B+C)3");
        } else {
            System.out.println("(X2) is not equal to (A+B+C)3");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 3 digits number: ");

        int x = Integer.parseInt(myNum.readLine());

        numFunc(x);
    }
}

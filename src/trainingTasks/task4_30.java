package trainingTasks;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class task4_30 {

    public static void countNum(int x) {
        if (x < 100) {
            System.out.println("This number has two digits");
        } else {
            System.out.println("This number has more than 2 digits");
        }
    }

    public static void addNum(int x) {
        int a = x / 100;
        int b = (x / 10) % 10;
        int c = x % 10;

        if ((a * b * c) <= 99) {
            System.out.println("Addition of all 3 digits has 2 digits!");
        } else if ((a * b * c) > 99) {
            System.out.println("Addition of all 3 digits has 3 number");
        } else if ((a * b * c) > 999) {
            System.out.println("Addition of all 3 digits has more than 3 digits");
        }
    }

    public static void maxNumV(int x) {
        int a = x / 100;
        int b = x / 10;
        int c = x % 10;

        if ((a * b * c) == x) {
            System.out.println("Addition of all 3 digits a equal to X");
        } else if ((a * b * c) > x) {
            System.out.println("Addition of all 3 digits a greater than X");
        } else {
            System.out.println("Addition of all 3 digits a smaller than X");
        }
    }

    public static void subtractNum(int x) {
        int a = x / 100;
        int b = x / 10;
        int c = x % 10;

        if (((a + b + c) % 5) == 0) {
            System.out.println("Sum of all 3 digits a subtract on 5");
        } else {
            System.out.println("Sum of all 3 digits does not subtract on 5");
        }
    }

    public static void minNum(int x) {
        int a = x / 100;
        int b = x / 10;
        int c = x % 10;

        if ((x % (a + b + c)) == 0) {
            System.out.println("X is divided by sum of all 3 digits");
        } else {
            System.out.println("X is not divided by sym of all 3 digits");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three digits number:");

        int x = Integer.parseInt(myNum.readLine());

        countNum(x);
        addNum(x);
        maxNumV(x);
        subtractNum(x);
        minNum(x);
    }
}

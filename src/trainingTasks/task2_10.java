package trainingTasks;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class task2_10 {

    public static int decCount(int x) {
        return x / 10;
    }

    public static int simpleCount(int x) {
        return x % 10;
    }

    public static int sumNum(int s, int d) {
        return s + d;
    }

    public static int addNum(int s, int d) {
        return s * d;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two decimal number: ");

//        decCount x = new decCount();
        int x = Integer.parseInt(myNum.readLine());
//        x.countDec();
        int d = decCount(x);
        int s = simpleCount(x);
        System.out.println("Your number - " + x + " has - " + decCount(x) + " decimal numbers and " + simpleCount(x) + " simple numbers");
        System.out.println("Sum of two numbers = " + sumNum(s, d));
        System.out.println("Additional of two numbers is - " + addNum(s, d));
    }
}
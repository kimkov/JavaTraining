package trainingTasks;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class task2_12 {

    public static int simpleNumbers(int x) {
        return x % 10;
    }

    public static int digitsNumbers(int x) {
        return (x % 100) / 10;
    }
    public static int hundredsNumber(int x) {
        return (x % 1000) / 100;
    }

    public static int sumNum(int s, int d, int h) {
        return s + d + h;
    }

    public static int addNum(int s, int d, int h) {
        return s * d * h;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the 3 digits number: ");

        int x = Integer.parseInt(myNum.readLine());

        int s = simpleNumbers(x);
        int d = digitsNumbers(x);
        int h = hundredsNumber(x);

        System.out.println("The amount of simple numbers is - " + simpleNumbers(x));
        System.out.println("The amount of decimal number is - " + digitsNumbers(x));
        System.out.println("The amount of hundreds numbers is - " + hundredsNumber(x));
        System.out.println("The sum of all digits in this number is - " + sumNum(s, d, h));
        System.out.println("The addition of all digits in this number is - " + addNum(s, d, h));
    }
}

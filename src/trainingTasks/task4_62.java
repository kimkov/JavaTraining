package trainingTasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class task4_62 {

    public static void threeNum(int x) {
        int a = x / 1000;
        int b = (x % 1000) / 100;
        int c = (x % 100) / 10;
        int d = x % 10;

        if ((a == b) && (b == c)) {
            System.out.println("There is 3 same numbers");
        } else if ((a == b) && (b == d)) {
            System.out.println("There is 3 same numbers");
        } else if ((a == c) && (a == d)) {
            System.out.println("There is 3 same numbers");
        } else if ((b == c) && (c == d)) {
            System.out.println("There is 3 same numbers");
        } else {
            System.out.println("There is NO 3 same numbers");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 4 digit number: ");

        int x = Integer.parseInt(myNum.readLine());

        threeNum(x);
    }
}

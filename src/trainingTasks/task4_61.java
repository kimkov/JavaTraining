package trainingTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4_61 {

    public static void paleNum(int x) {
        int a = x / 1000;
        int b = (x % 1000) / 100;
        int c = (x % 100) / 10;
        int d = x % 10;

        if ((a == d && b == c)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 4 digit number: ");

        int x = Integer.parseInt(myNum.readLine());

        paleNum(x);
    }
}

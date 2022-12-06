package trainingTasks;

import java.io.InputStreamReader;               // number 88
import java.io.BufferedReader;
import java.io.IOException;

public class task4_64 {

    public static void happyNum(int x) {
        int a = x / 100000;
        int b = (x % 100000) / 10000;
        int c = (x % 10000) / 1000;
        int d = (x % 1000) / 100;
        int v = (x % 100) / 10;
        int n = x % 10;

        String result = ((a + b + c) == (d + v + n)) ? "This is happy Number" : "NOPE its not happy number";
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 6 digit number: ");

        int x = Integer.parseInt(myNum.readLine());

        happyNum(x);
    }
}

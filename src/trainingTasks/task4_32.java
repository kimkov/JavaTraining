package trainingTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4_32 {

    public static void addNum(int x) {
        int a, b, c, z;
        a = x / 1000;
        b = (x % 1000) / 100;
        c = (x % 100) / 10;
        z = (x % 100) % 10;

        if ((a + b) == (c + z)) {
            System.out.println("Sum of first and second equal to third and forth");
        } else {
            System.out.println("Sum of first and second does not equal to third and forth");
        }
    }

    public static void divNum(int x) {

        int a, b, c, d;
        a = x / 1000;
        b = (x % 1000) / 100;
        c = (x % 100) / 10;
        d = (x % 100) % 10;

        String result = (a + b + c + d) % 3 == 0 ? "YEP" : "NOPE";
        System.out.println(result);
    }

    public static void divFour(int x) {
        int a, b, c, d;
        a = x / 1000;
        b = (x % 1000) / 100;
        c = (x % 100) / 10;
        d = (x % 100) % 10;

        String result1 = (a * b * c * d) % 4 == 0 ? "Divided by 4" : "Does not divided by 4";
        System.out.println(result1);
    }

    public static void divXNum(int x) {
        int a, b, c, d;
        a = x / 1000;
        b = (x % 1000) / 100;
        c = (x % 100) / 10;
        d = (x % 100) % 10;

        String result2 = (a * b * c * d) % x == 0 ? "Divided by X" : "Does not divided by X";
        System.out.println(result2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 4 digit number: ");

        int x = Integer.parseInt(myNum.readLine());
        addNum(x);
        divNum(x);
        divFour(x);
        divXNum(x);
    }
}

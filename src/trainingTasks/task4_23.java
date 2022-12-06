package trainingTasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class task4_23 {

    public static void defFunc1(int x) {
        int a, b;
        if (x < 10 || x > 99) {
            System.out.println("Number should be between 10 and 100!");
        } else {
            a = x / 10;
            b = x % 10;
            if (a > b) {
                System.out.println("a " + a + " larger than b " + b);
            } else if (a < b) {
                System.out.println("a " + a + " smaller than b " + b);
            } else {
                System.out.println("This both digits are equal");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number between 10 and 100: ");

        int x = Integer.parseInt(myNum.readLine());

        defFunc1(x);
    }
}

package trainingTasks;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class task4_6 {

    public static void smallLarge(int x, int y) {
        if (x == y) {
            System.out.println("This two numbers are equal!");
        } else if (x < y) {
            System.out.println("y " + y + " greater than x " + x);
        } else {
            System.out.println("x " + x + " greater than y " + y);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter x: ");

        BufferedReader myNum1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter y: ");

        int x = Integer.parseInt(myNum.readLine());
        int y = Integer.parseInt(myNum1.readLine());

        smallLarge(x, y);
    }
}

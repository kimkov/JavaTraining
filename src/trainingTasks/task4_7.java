package trainingTasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class task4_7 {

    public static void maxMin(int x, int y) {
        if (x == y) {
            System.out.println("This two numbers are equal!");
        } else if (x > y) {
            System.out.println("x " + x + " greater than y " + y);
        } else {
            System.out.println("y " + y + " greater than x " + x);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter x: ");

        BufferedReader myNum1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter y: ");

        int x = Integer.parseInt(myNum.readLine());
        int y = Integer.parseInt(myNum1.readLine());

        maxMin(x, y);
    }
}

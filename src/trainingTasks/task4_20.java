package trainingTasks;

import java.io.BufferedReader;      // number 67
import java.io.InputStreamReader;
import java.io.IOException;

public class task4_20 {

    public static void defFunc(int x, int y) {
        if ((x % y) == 0) {
            System.out.println("X " + x + " is divide by Y " + y);
        } else {
            System.out.println("X " + x + " is not divided by Y " + y);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter x: ");

        BufferedReader myNum1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter y: ");

        int x = Integer.parseInt(myNum.readLine());
        int y = Integer.parseInt(myNum1.readLine());

        defFunc(x, y);
    }
}

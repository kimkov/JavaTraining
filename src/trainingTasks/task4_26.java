package trainingTasks;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class task4_26 {

    public static void defFunc(int x) {
        int a = x / 10;
        int b = x % 10;
        if ((a + b) % 3 == 0 && (a + b) % x == 0) {
            System.out.println("Sum of its digits divided by three and sum of its digits divided by X!");
        } else if ((a + b) % 3 == 0 && (a + b) % x != 0) {
            System.out.println("Sum of its digits divided by three and sum of its digits NOT divided by X!");
        } else if ((a + b) % 3 != 0 && (a + b) % x != 0) {
            System.out.println("Sum of its digits NOT divided by three and sum of its digits NOT divided by X!");
        } else if ((a + b) % 3 != 0 && (a + b) % x == 0) {
            System.out.println("Sum of its digits NOT divided by three and sum of its digits divided by X!");
        } else {
            System.out.println("Does not fit any conditions!");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number between 10 and 99");

        int x = Integer.parseInt(myNum.readLine());

        defFunc(x);
    }
}

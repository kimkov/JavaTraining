package trainingTasks;

import java.io.InputStreamReader;       // number 68
import java.io.BufferedReader;
import java.io.IOException;

public class task4_22 {

    public static void defFunc(int x) {
        if (x % 2 == 0 && x >= 10) {
            int z = x % 10;
            System.out.println("This is even number and this number finish on " + z);
        } else if (x % 2 == 0 && x / 10 == 0) {
            System.out.println("This is even number but it has only 1 digit");
        } else if (x < 10 && x % 2 != 0) {
            System.out.println("This is odd number and it smaller than 10");
        } else if (x > 10 && x % 10 == 7) {
            System.out.println("This is odd and it finish on 7");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");

        int x = Integer.parseInt(myNum.readLine());

        defFunc(x);
    }
}

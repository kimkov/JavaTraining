package trainingTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2_21 {

    public static void countN(int x) {
        int simpleN = 0, decN = 0;
        if (x <= 9) {
            System.out.println("The number should be greater than 9");
        } else {
            simpleN = x % 10;
            decN = x / 10;
        }
        System.out.println("This number has " + simpleN + " simple numbers");
        System.out.println("This number has " + decN + " decimal numbers");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        int x = Integer.parseInt(myNum.readLine());

        countN(x);
    }
}

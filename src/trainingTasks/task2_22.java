package trainingTasks;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class task2_22 {

    public static void countN1(int x) {
        int dNum = 0, hNum = 0;
        if (x <= 99) {
            System.out.println("The number should be greater than 99!");
        } else {
            dNum = (x % 100) / 10;
            hNum = (x / 100) % 10;
        }
        System.out.println("decimal - " + dNum);
        System.out.println("hundreds - " + hNum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number greater than 99 - ");

        int x = Integer.parseInt(myNum.readLine());

        countN1(x);
    }
}

package trainingTasks;

import java.io.BufferedReader;                  // 99
import java.io.IOException;
import java.io.InputStreamReader;

public class task4_128 {

    public static void ageFunc(int x) {
        if ((x < 1) || (x > 1188)) {
            System.out.println("The number should be between 1 and 1188!");
        } else if ((x / 12) < 1) {
            System.out.println(x % 12 + " Month");
        } else if ((x / 12) >= 1) {
            System.out.println(x / 12 + " Year " + x % 12 + " month");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number between 1 and 1188: ");

        int x = Integer.parseInt(myNum.readLine());

        ageFunc(x);
    }
}

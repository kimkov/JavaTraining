package trainingTasks;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class task2_19 {
    public static int sumFour(int x) {
        int sum = 0;
        while (x != 0) {
            sum += (x % 10);
            x /= 10;
        }
        return sum;
    }

    public static int addFour(int x) {
        int addDigits = 1;
        while (x > 0) {
            addDigits *= (x % 10);
            x /= 10;
        }
        return addDigits;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 4 digits number: ");
        int x = Integer.parseInt(myNum.readLine());

        System.out.println("Sum of all 4 digits is - " + sumFour(x));
        System.out.println("Additional off all 4 digits is - " + addFour(x));
    }
}

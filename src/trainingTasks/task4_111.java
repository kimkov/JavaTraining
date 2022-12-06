package trainingTasks;

import java.io.BufferedReader;              // number 93
import java.io.IOException;
import java.io.InputStreamReader;

public class task4_111 {

    public static void weekdays(int x) {
        int k = x % 7;
        switch (k) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 0 -> System.out.println("Sunday");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the between 1 and 365: ");

        int x = Integer.parseInt(myNum.readLine());

        weekdays(x);
    }
}

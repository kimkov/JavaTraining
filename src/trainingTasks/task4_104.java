package trainingTasks;

import java.io.BufferedReader;          // number 89
import java.io.IOException;
import java.io.InputStreamReader;

public class task4_104 {

    public static void weekDay(int x) {
        switch (x) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Number should be between 1 and 7");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number between 1 and 7: ");

        int x = Integer.parseInt(myNum.readLine());

        weekDay(x);
    }
}

package trainingTasks;

import java.util.Scanner;

public class task1_61_v {

    public static void main(String[] args) {
        try (Scanner myNum = new Scanner(System.in)) {
            System.out.println("Enter x: ");

            int x = myNum.nextInt();

            int x2 = x * x;
            int x4 = x2 * x2;
            int x6 = x4 * x2;
            int x7 = x6 * x;

            System.out.println(x7);
        }
    }
}

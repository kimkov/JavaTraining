package trainingTasks;

import java.util.Scanner;

public class task1_15_b {

    public static void main(String[] args) {
        try (Scanner myNum = new Scanner(System.in)) {
            System.out.println("Enter the three numbers: ");

            int x = myNum.nextInt();
            int y = myNum.nextInt();
            int z = myNum.nextInt();

            int result = x / (y * z);

            System.out.println("X = " + x + " Y = " + y + " Z = " + z);
            System.out.println(result);
        }
    }
}

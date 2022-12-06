package trainingTasks;

import java.util.Scanner;

public class task1_25 {

    public static void main(String[] args) {
        try (Scanner myNum = new Scanner(System.in)) {
            System.out.println("Enter the side of square: ");

            int x = myNum.nextInt();

            System.out.println(x * 4);
        }
    }
}

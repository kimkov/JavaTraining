package trainingTasks;

import java.util.Scanner;

public class task1_14_a {
    
    public static void main (String[] args) {
        try (Scanner myNum = new Scanner(System.in)) {
            System.out.println("Enter the number: ");

            int x = myNum.nextInt();

            // int result = x * 2;

            System.out.println(x * 2);
        }
    }
}

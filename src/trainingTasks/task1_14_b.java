package trainingTasks;

import java.util.Scanner;

public class task1_14_b {
    
    public static void main (String[] args) {
        try (Scanner myNum = new Scanner(System.in)) {
            System.out.println("Enter the number: ");

            int x = myNum.nextInt();

            // Double result = Math.sin(x);

            System.out.println(Math.sin(x));
        }
    }
}

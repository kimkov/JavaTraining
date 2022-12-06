package trainingTasks;

import java.util.Scanner;

public class task1_15_a {
    
    public static void main (String[] args) {
        
        try (Scanner myNum = new Scanner(System.in)) {
            System.out.println("Enter the number: ");

            int x = myNum.nextInt();

            Double result = -1 / (Math.pow(x, 2));

            System.out.format("%.2f\n", result);
        }
    }
}

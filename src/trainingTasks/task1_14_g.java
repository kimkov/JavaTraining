package trainingTasks;

import java.util.Scanner;

public class task1_14_g {
    
    public static void main (String[] args) {

        try (Scanner myNum = new Scanner(System.in)) {
            System.out.println("Enter the number: ");

            int x = myNum.nextInt();

            System.out.format("%.2f\n", Math.sqrt(x));
        }
    }
}

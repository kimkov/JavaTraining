package trainingTasks;

import java.util.Scanner;

public class task1_14_e {
    
    public static void main (String[] args) {

        try (Scanner myNum = new Scanner(System.in)) {
            System.out.println("Enter the number: ");

            int x = myNum.nextInt();

            System.out.format("The equation 5*cosx = " + "%.2f\n", 5*(Math.cos(x)));
        }
    }
}

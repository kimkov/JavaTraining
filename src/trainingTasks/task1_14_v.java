package trainingTasks;

import java.util.Scanner;

public class task1_14_v {
    
    public static void main (String[] args) {

        try (Scanner myNum = new Scanner(System.in)) {
            System.out.println("Enter the number: ");

            int x = myNum.nextInt();

            System.out.println(Math.pow(x, 3));
        }
    }
}

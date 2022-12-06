package trainingTasks;

import java.util.Scanner;

public class task1_12_v {
    public static void main (String[] args) {
        try (Scanner myNum = new Scanner(System.in)) {
            System.out.println("Enter two numbers: ");

            int x = myNum.nextInt();
            int y = myNum.nextInt();

            System.out.println(x + " 25\n" + x + " " + y);
        }
    }
    
}

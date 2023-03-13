package trainingTasks;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        try (Scanner myNum = new Scanner(System.in)) {
            System.out.println("Enter x: ");
            int a = myNum.nextInt();
            System.out.println("Enter y: ");
            int b = myNum.nextInt();

            System.out.println("a = " + a + " b = " + b);
            a = a ^ b;
            b = b ^ a;
            a = a ^ b;

            System.out.println("a = " + a + " b = " + b);

        }
    }
}

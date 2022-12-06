package trainingTasks;

import java.util.Scanner;

public class task1_60_b {

    public static void main(String[] args) {
        try (Scanner myNum = new Scanner(System.in)) {
            System.out.println("Enter a: ");
            int a = myNum.nextInt();

            System.out.println("Enter b: ");
            int b = myNum.nextInt();

            System.out.println("Enter c: ");
            int c = myNum.nextInt();

            System.out.println("a = " + a + " b = " + b + " c = " + c);

            b = b ^ a;
            a = a ^ b;
            b = b ^ a;
            a = a ^ c;
            c = c ^ a;
            a = a ^ c;

            System.out.println("a = " + a + " b = " + b + " c = " + c);
        }
    }
}

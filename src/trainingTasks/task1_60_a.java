package trainingTasks;

import java.util.Scanner;

class task1_60_a {

    public static void main(String[] args) {
        try (Scanner myNum = new Scanner(System.in)) {
            System.out.println("Enter number a: ");
            int a = myNum.nextInt();

            System.out.println("Enter number b: ");
            int b = myNum.nextInt();

            System.out.println("Enter number c: ");
            int c = myNum.nextInt();

            System.out.println("a = " + a + " b = " + b + " c = " + c);

            a = a ^ b;
            b = b ^ a;
            a = a ^ b;
            b = b ^ c;
            c = c ^ b;
            b = b ^ c;

            System.out.println("a = " + a + " b = " + b + " c = " + c);
        }
    }
}
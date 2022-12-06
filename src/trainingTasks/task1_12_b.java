package trainingTasks;

import java.util.Scanner;
class task1_12_b {
    public static void main(String[] args) {
        try(Scanner myNum = new Scanner(System.in)) {
            System.out.println("Enter two numbers: ");

            int numA = myNum.nextInt();
            int numB = myNum.nextInt();

            System.out.println("100 " + numA + "\n1949 " + numB);
        }
    }
}
package trainingTasks;

import java.util.Scanner;

class task1_4 {
    public static void main(String[] args) {
        try(Scanner myNum = new Scanner(System.in)) {
            System.out.println("What is Your number: ");

            String result = myNum.nextLine();
            System.out.println("Number is: " + result);
        }
    }
}
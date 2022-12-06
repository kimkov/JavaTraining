package trainingTasks;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Enter the number: ");

            String myNumber = myObj.nextLine();
            System.out.println("You entered number - " + myNumber);
        }
    }
}
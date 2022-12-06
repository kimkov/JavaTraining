package trainingTasks;

import java.util.Scanner;

public class task1_61_a {

    public static void main(String[] args) {
        try (Scanner myNum = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int x = myNum.nextInt();
            @SuppressWarnings("unused")
			int n = 2;

            x = x * x;
            x = x * x;

            System.out.println(x);
        }
    }
}

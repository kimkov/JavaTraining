package trainingTasks;

import java.util.Scanner;

public class task1_15_e {

    public static void main(String[] args) {

        try (Scanner myNum = new Scanner(System.in)) {
            System.out.println("Enter three numbers: ");

            int a = myNum.nextInt();
            int b = myNum.nextInt();
            int c = myNum.nextInt();


            Double result = -b + Math.sqrt((Math.pow(b, 2) - (4 * a * c))) / (2 * a);

            System.out.format("%.2f\n", result);
        }
    }
}

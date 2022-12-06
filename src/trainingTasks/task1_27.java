package trainingTasks;

import java.util.Scanner;

public class task1_27 {

    public static void main(String[] args) {
        try (Scanner myNum = new Scanner(System.in)) {
            System.out.print("Enter the number of distance: ");

            int r = 6350;
            double h = myNum.nextDouble();
            double d = Math.sqrt(h * (2 * r + h));

            System.out.format("%.2f\n",d);
        }
    }
}

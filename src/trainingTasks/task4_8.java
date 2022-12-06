package trainingTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4_8 {

    public static void dist(double x, double y) {
        double foot = 0.305;
        if ((x / foot) == y) {
            System.out.println("This two distance are equal!");
        } else if ((x / foot) > y) {
            System.out.println("Distance x " + x + " greater than distance y " + y);
        } else {
            System.out.println("Distance y " + y + " greater than distance x " + x);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter distance in metric x: ");

        BufferedReader myNum1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter distance in imperial y: ");

        double x = Double.parseDouble(myNum.readLine());
        double y = Double.parseDouble(myNum1.readLine());

        dist(x, y);
    }
}

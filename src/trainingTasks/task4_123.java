package trainingTasks;

import java.io.BufferedReader;              // number 96
import java.io.InputStreamReader;
import java.io.IOException;

public class task4_123 {

    public static void strAngTr(Double a, Double b, Double c) {
        if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)) {
            System.out.println("Straight angle triangle");
        } else if ((Math.pow(b, 2) + Math.pow(c, 2)) == Math.pow(a, 2)) {
            System.out.println("Straight angle triangle");
        } else if ((Math.pow(a, 2) + Math.pow(c, 2)) == Math.pow(b, 2)) {
            System.out.println("Straight angle triangle");
        } else {
            System.out.println("NOT Straight angle triangle");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNumA = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader myNumB = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader myNumC = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter A: ");
        Double a = Double.parseDouble(myNumA.readLine());

        System.out.println("Enter B: ");
        Double b = Double.parseDouble(myNumB.readLine());

        System.out.println("Enter C: ");
        Double c = Double.parseDouble(myNumC.readLine());

        strAngTr(a, b, c);
    }
}

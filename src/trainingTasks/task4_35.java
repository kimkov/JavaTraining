package trainingTasks;

import java.io.IOException;                 // number 80
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class task4_35 {

    public static void countSquare(int a, int b, int c, int d) {
        if ((a < c) && (a < d) || (b < c) && (b < d)) {
            System.out.println("Box smaller than square");
        } else if ((a >= c) && (a >= d) && (b >= c) && (b >= d)) {
            int longSide = (a / c) * (b / d);
            int shortSide = (a / d) * (b / c);
            String result = longSide > shortSide ? "Max squares along long side " + longSide : "Max squares along short side " + shortSide;
            System.out.println(result);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNumA = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader myNumB = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter dimensions of the table X and Y");
        int a = Integer.parseInt(myNumA.readLine());
        int b = Integer.parseInt(myNumB.readLine());

        BufferedReader myNumC = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader myNumD = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter dimension of the square C and D:");
        int c = Integer.parseInt(myNumC.readLine());
        int d = Integer.parseInt(myNumD.readLine());

        System.out.println("Side A of the box - " + a);
        System.out.println("Side B of the box - " + b);
        System.out.println("Side C of the square - " + c);
        System.out.println("Side D of the square - " + d);

        countSquare(a, b, c, d);
    }
}

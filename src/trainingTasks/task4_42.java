package trainingTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4_42 {

    public static void maxMin1(int a, int b, int c) {
        if ((a < b) && (b < c)) {
            System.out.println("YEP a < b < c");
        } else if ((b > a) && (a > c)) {
            System.out.println("YEP b > a > c");
        } else {
            System.out.println("NONE of them");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNumA = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader myNumB = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader myNumC = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 3 numbers: ");

        int a = Integer.parseInt(myNumA.readLine());
        int b = Integer.parseInt(myNumB.readLine());
        int c = Integer.parseInt(myNumC.readLine());

        maxMin1(a, b, c);
    }
}

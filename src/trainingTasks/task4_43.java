package trainingTasks;

import java.io.BufferedReader;              // number 82
import java.io.InputStreamReader;
import java.io.IOException;

public class task4_43 {

    public static void compNum(int a, int b) {
        if ((a % b) == 0) {
            System.out.println("A divided by B");
        } else if ((b % a) == 0) {
            System.out.println("B divided by A");
        } else {
            System.out.println("NONE of them");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNumA = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader myNumB = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 3 numbers: ");

        int a = Integer.parseInt(myNumA.readLine());
        int b = Integer.parseInt(myNumB.readLine());

        compNum(a, b);
    }
}

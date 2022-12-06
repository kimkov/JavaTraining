package trainingTasks;

import java.io.IOException;                 // number 83
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task4_45 {

    public static void compNum(int a, int b, int c) {
        String result = a == b || b == c || a == c ? "YEP" : "NOPE";
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNumA = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader myNumB = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader myNumC = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 3 number: ");

        int a = Integer.parseInt(myNumA.readLine());
        int b = Integer.parseInt(myNumB.readLine());
        int c = Integer.parseInt(myNumC.readLine());

        compNum(a, b, c);
    }
}

package trainingTasks;

import java.io.BufferedReader;                  // number 79
import java.io.IOException;
import java.io.InputStreamReader;

public class task4_34 {

    public static void divNum(int a, int b) {
        String resultA = (a % b) == 0 ? "A is divided by B" : "A does not divided by B";
        String resultB = (b % a) == 0 ? "B is divided by A" : "B does not divided by A";

        System.out.println(resultA);
        System.out.println(resultB);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader myNum1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number 1 and 2: ");


        int a = Integer.parseInt(myNum.readLine());
        int b = Integer.parseInt(myNum1.readLine());

        divNum(a, b);
    }
}

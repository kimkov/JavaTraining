package trainingTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2_13 {

    public static int mirrorNum(int x) {
        int mirror = 0;
        while (x != 0) {
            mirror = mirror * 10 + (x % 10);
            x = x / 10;
        }
        return mirror;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three digits number: ");

        int x = Integer.parseInt(myNum.readLine());

        System.out.println("Result is - " + mirrorNum(x));
    }
}
package trainingTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int x = Integer.parseInt(myNum.readLine());

        if (x < 1000) {
            System.out.println("There is no full tons");
        } else {
            int result = x / 1000;
            System.out.println("There is " + result + " full tons");
        }
    }
}

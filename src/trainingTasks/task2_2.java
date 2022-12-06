package trainingTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");

        int x = Integer.parseInt(myNum.readLine());

        if (x > 100) {
            int result = x / 100;
            System.out.println("There is " + result + " full centners");
        } else {
            System.out.println("There is no full centners");
        }
    }
}
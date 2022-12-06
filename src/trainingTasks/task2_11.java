package trainingTasks;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class task2_11 {
    public static int Reversed(int x) {
        int reversedNum = 0;
        while (x != 0) {
            int digit = x % 10;
            reversedNum = reversedNum * 10 + digit;
            x /= 10;
        }
        return reversedNum;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");

        int x = Integer.parseInt(myNum.readLine());
        System.out.println(Reversed(x));
    }
}
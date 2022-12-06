package trainingTasks;

import java.io.IOException;             // number 72
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class task4_27 {

    public static void paleNum(int x) {
        if (x < 100 || x > 999) {
            System.out.println("Number should has 3 digits");
        }else if (x / 100 == x % 10) {
            System.out.println("This number is palindrome");
        } else {
            System.out.println("This number is not palindrome");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");

        int x = Integer.parseInt(myNum.readLine());

        paleNum(x);
    }
}

package trainingTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2_17 {

    public static String reverseS(String s) {
        if (s.length() == 1) {
            return s;
        } else {
            return String.valueOf(s.charAt(0)) + s.charAt(s.length() - 1) + reverseS(s.substring(1, s.length() - 1));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 3 digits number: ");
        String s = myNum.readLine();

        System.out.println(reverseS(s));
    }
}
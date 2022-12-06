package trainingTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2_14 {

    public static String swap(int x) {
        String s = Integer.toString(x);
        char c = s.charAt(0);
        return s.substring(1) + c;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three digits number: ");

        int x = Integer.parseInt(myNum.readLine());

        System.out.println("Result is - " + swap(x));
    }
}

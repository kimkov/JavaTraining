package trainingTasks;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class task2_15 {

    public static String swapChar(int x) {
        String s = Integer.toString(x);
        char c = s.charAt(s.length() - 1);
        String r = s.substring(0, s.length() - 1);
        return c + r;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");

        int x = Integer.parseInt(myNum.readLine());

        System.out.println(swapChar(x));
    }
}
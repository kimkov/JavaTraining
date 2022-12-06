package trainingTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4_31 {

    public static void vsNum(int x) {
        int a = x / 100;
        int b = (x / 10) % 10;
        int c = x % 10;

        if ((a == b) && (b == c)) {
            System.out.println("All number are equal");
        } else if (a == b) {
            System.out.println("There is only two similar numbers A and B");
        } else if (b == c) {
            System.out.println("There is only two similar numbers B and C");
        } else if (a == c) {
            System.out.println("There is only two similar numbers A and C");
        } else {
            System.out.println("There is no similar numbers");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the 3 digits number: ");

        int x = Integer.parseInt(myNum.readLine());

        vsNum(x);
    }
}

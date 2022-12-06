package trainingTasks;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class task4_28 {

     public static void maxNum(int x) {
        int a = x / 100;
        int b = x / 10;
        int c = x % 10;
        if (a > b) {
             System.out.println("A is greater than B");
        } else if (a < b) {
             System.out.println("A is smaller than b");
        } else if (a == b) {
             System.out.println("A is equal to B");
        } else if ((a == c) && (a == b)) {
            System.out.println("All numbers are equal");
        } else if (a > c) {
            System.out.println("A is greater than C");
        } else if (a < c) {
            System.out.println("A is smaller than C");
        } else if (a == c) {
            System.out.println("A is equal to C");
        } else if (b == c) {
            System.out.println("B is equal to C");
        } else if (b > c) {
            System.out.println("B is greater than C");
        } else if (b < c) {
            System.out.println("B is smaller than C");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");

        int x = Integer.parseInt(myNum.readLine());

        maxNum(x);
    }
}

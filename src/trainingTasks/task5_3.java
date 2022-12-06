package trainingTasks;

import java.io.IOException;             // 102
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task5_3 {

    public static void printNum() {
        int i;
        System.out.print("Task A: ");
        for (i = 20; i <= 35; i++) {
            System.out.print(i + " ");
        }
    }

    public static void printNumA(int a) {
        int i;
        System.out.println(" ");
        System.out.print("Task B: ");
        if (a < 10) {
            System.out.println("A should be greater than 10");
        } else {
            for (i = 10; i <= a; i++) {
                System.out.print(Math.pow(i, 2) + " ");
            }
        }
    }

    public static void printNumB(int b) {
        int i;
        System.out.println(" ");
        System.out.print("Task V: ");
        if (b > 50) {
            System.out.println("B should be greater than 50!");
        } else {
            for (i = 0; i <= 50; i++) {
                System.out.print(Math.pow(i, 3) + " ");
            }
        }
    }

    public static void printNumG(int a, int b) {
        int i;
        System.out.println(" ");
        System.out.print("Task G: ");
        if (b < a) {
            System.out.println("B should be greater than A!");
        } else {
            for (i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNumA = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter A, A should be greater than 10: ");
        int a = Integer.parseInt(myNumA.readLine());

        BufferedReader myNumB = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter B, B should be smaller than 50: ");
        int b = Integer.parseInt(myNumB.readLine());

        printNum();
        printNumA(a);
        printNumB(b);
        printNumG(a, b);
    }
}

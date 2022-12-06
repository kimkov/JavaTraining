package trainingTasks;

import java.io.InputStreamReader;                   // 124
import java.io.IOException;
import java.io.BufferedReader;

public class task5_67_v {

    public static void sumFiboNum(int n, int x) {
        int[] arr = new int[n];
        int result = 0;
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int r : arr) {
            System.out.print(r + " ");
        }
        System.out.println(" ");
        for (int j = 0; j <= x; j++) {
            result += j;
        }
        if (result % 2 == 0) {
            System.out.print("The sum of 5 first numbers is even " + result);
        } else {
            System.out.println("The sum of 5 first numbers is odd " + result);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader NumN = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter N - ");
        int n = Integer.parseInt(NumN.readLine());

        BufferedReader NumX = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter X - ");
        int x = Integer.parseInt(NumX.readLine());

        sumFiboNum(n, x);
    }
}

package trainingTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4_122 {

    public static void triangleFunc(int a, int b, int c) {
        String result = (a + b > c && a + c > b && b + c > a) ? "This is a triangle" : "This is not triangle";
        System.out.println(result);
        }

    public static void main(String[] args) throws IOException {
        BufferedReader myNumA = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader myNumB = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader myNumC = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter A: ");
        int a = Integer.parseInt(myNumA.readLine());

        System.out.println("Enter B: ");
        int b = Integer.parseInt(myNumB.readLine());

        System.out.println("Enter C: ");
        int c = Integer.parseInt(myNumC.readLine());

        triangleFunc(a, b, c);
    }
}

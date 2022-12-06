package trainingTasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class task5_2 {

    public static void sicleFunc(int x, int y) {
        int i;
        for (i = 0; i < y; i++) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNumA = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number for output: ");
        int x = Integer.parseInt(myNumA.readLine());

        BufferedReader myNumB = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number for repetition: ");
        int y = Integer.parseInt(myNumB.readLine());

        sicleFunc(x, y);
    }
}

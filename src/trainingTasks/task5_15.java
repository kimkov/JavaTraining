package trainingTasks;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class task5_15 {

    public static void addTable(int x) {
        int i;
        for (i = 1; i <= 9; i++) {
            System.out.println(i * x);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number between 1 and 9: ");

        int x = Integer.parseInt(myNum.readLine());

        addTable(x);
    }
}

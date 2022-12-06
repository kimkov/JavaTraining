package trainingTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task6_37 {
    public static void main(String[] args) throws IOException {
        int m;

        do {
            BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the number 2, 5 or 10 - ");
            m = Integer.parseInt(myNum.readLine());

        } while (m > 0);
    }
}

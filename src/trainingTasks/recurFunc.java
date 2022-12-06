package trainingTasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class recurFunc {

    public static int sum(int x) {
        if (x >= 1) {
            return sum(x - 1) + x;
        }
        return x;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");

        int x = Integer.parseInt(myNum.readLine());

        System.out.println(sum(x));
    }

}

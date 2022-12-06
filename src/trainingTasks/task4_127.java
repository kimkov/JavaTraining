package trainingTasks;

import java.io.BufferedReader;                  // 98
import java.io.InputStreamReader;
import java.io.IOException;

public class task4_127 {

    public static void costFunc(int x) {
        if ((x < 1) || (x > 9999)) {
            System.out.println("The number should be between 1 and 9999");
        } else if ((x / 100) < 1) {
            System.out.println(x + " cents");
        } else if ((x / 100) >= 1) {
            System.out.println(x / 100 + " $ " + x % 100 + " cents");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number between 1 and 9999: ");

        int x = Integer.parseInt(myNum.readLine());

        costFunc(x);
    }
}

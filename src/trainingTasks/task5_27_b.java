package trainingTasks;

import java.io.IOException;                     // 114
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task5_27_b {

    public static int addNum(int x) {
        int result = 0;
        int i;
        for (i = x; i <= 500; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");

        int x = Integer.parseInt(myNum.readLine());

        System.out.println(addNum(x));
    }
}

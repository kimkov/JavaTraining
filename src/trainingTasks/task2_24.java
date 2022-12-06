package trainingTasks;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class task2_24 {

    public static int SearchNum(int x) {
        int z = x / 100;
        int c = x % 100;

        return c * 10 + z;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the 3 digits number: ");

        int x = Integer.parseInt(myNum.readLine());
        System.out.println(SearchNum(x));
    }
}

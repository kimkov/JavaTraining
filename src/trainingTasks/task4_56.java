package trainingTasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class task4_56 {

    public static void findNum(int x) {
        if (((x / 10) == 4) || (x % 10) == 4) {
            System.out.println("YEP 4");
        } else if ((x / 10) == 7 || (x % 10) == 7) {
            System.out.println("YEP 7");
        } else if ((x / 10) == 6 || (x % 10) == 6) {
            System.out.println("YEP 6");
        } else if ((x / 10) == 3 || (x % 10) == 3) {
            System.out.println("YEP 3");
        } else if ((x / 10) == 9 || (x % 10) == 9) {
            System.out.println("YEP 9");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 2 digits number: ");

        int x = Integer.parseInt(myNum.readLine());

        findNum(x);
    }
}

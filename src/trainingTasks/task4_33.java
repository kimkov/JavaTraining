package trainingTasks;

import java.io.BufferedReader;              // number 78
import java.io.IOException;
import java.io.InputStreamReader;

public class task4_33 {

    public static void lastNum(int x) {
        String result = ((x % 10) % 2) == 0 ? " last number is Even" : "Last number is Odd";
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");

        int x;
        try {
            x = Integer.parseInt(myNum.readLine());
        } catch (NumberFormatException nfe) {
            System.out.println("Should be number!!!");
            nfe.printStackTrace();
            throw nfe;
        }

        lastNum(x);
    }
}

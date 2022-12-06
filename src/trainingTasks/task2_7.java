package trainingTasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class square{
    int x;

    public int squareCount(int x) {
        if (x < 130) {
            System.out.println("There is no any squares!");
        } else {
            int result = x / 130;
            System.out.println("There is " + result + " squares");
        }
        return x;
    }
}

public class task2_7 {

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");

        square x = new square();
        x.x = Integer.parseInt(myNum.readLine());
        x.squareCount(x.x);
    }
}

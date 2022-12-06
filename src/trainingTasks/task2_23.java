package trainingTasks;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class task2_23 {

    public static void countN2(int x){
        int hNum = 0, tNum = 0;
        if (x <= 999) {
            System.out.println("The number should be greater than 999! ");
        } else {
            hNum = (x % 1000) / 100;
            tNum = (x / 1000) % 10;
        }
        System.out.println("This number has " + hNum + " Hundreds");
        System.out.println("This number has " + tNum + " Thousands");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number greater than 999 ");
        int x = Integer.parseInt(myNum.readLine());

        countN2(x);
    }
}

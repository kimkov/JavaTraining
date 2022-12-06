package trainingTasks;

import java.io.BufferedReader;                  // 97
import java.io.IOException;
import java.io.InputStreamReader;

public class task4_126 {

    public static void mushFunc(int x) {
        if (x == 1) {
            System.out.println("we collect " + x + " mushroom");
        } else if ((x > 1) && (x < 5)) {
            System.out.println("we found " + x + " mushrooms");
        } else if (x >= 5) {
            System.out.println("we collect " + x + " mushroomsS");
        } else {
            System.out.println("we do not found any mushrooms");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the amount of mushrooms: ");

        int x = Integer.parseInt(myNum.readLine());

        mushFunc(x);
    }
}

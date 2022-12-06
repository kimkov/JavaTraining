package trainingTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Distance {
    int m, km;

    void km() {
        if (m < 1000) {
            System.out.println("There is no full kilometers");
        } else {
            km = m / 1000;
            System.out.println("There is " + km + " full kilometers");
        }
    }
}

public class task2_4 {

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of meters: ");

        Distance m = new Distance();
        m.m = Integer.parseInt(myNum.readLine());
        m.km();
    }
}

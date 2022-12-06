package trainingTasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Week {
    int days, weeks;

    void dWeeks() {
        if (days < 7) {
            System.out.println("There is no full weeks");
        } else {
            weeks = days / 7;
            System.out.println("There is " + weeks + " full weeks");
        }
    }
}

public class task2_5 {

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter amount of days: ");

        Week days = new Week();
        days.weeks = Integer.parseInt(myNum.readLine());
        days.dWeeks();
    }
}

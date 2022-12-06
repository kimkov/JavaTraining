package trainingTasks;

import java.text.DecimalFormat;

public class task5_9 {

    public static void inchTable() {
        int i;
        double result;
        DecimalFormat df = new DecimalFormat("#.##");
        for (i = 10; i <= 22; i++) {
            result = i * 25.4;
            System.out.println(i + " inches is equal to " + df.format(result) + " cm");
        }
    }

    public static void main(String[] args) {
        inchTable();
    }
}

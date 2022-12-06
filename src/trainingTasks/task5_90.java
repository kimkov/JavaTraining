package trainingTasks;

import java.text.DecimalFormat;

public class task5_90 {

    public static double factSum(int x) {
        double factorial = 1;
        double sum = 0;
        for (int i = 1; i <= x; i++) {
            factorial *= i;
            sum += 1 / factorial;
        }
        return 1 + sum;
    }

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println(df.format(factSum(5)));
    }
}

package trainingTasks;

import java.text.DecimalFormat;

public class task5_92 {

    public static double sqrtSum(int x) {
        double sum = 0;
        for (int i = 0; i < x; i++) {
            sum += Math.sqrt(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println(df.format(sqrtSum(10)));
    }
}

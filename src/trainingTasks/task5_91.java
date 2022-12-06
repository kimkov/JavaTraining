package trainingTasks;

import java.text.DecimalFormat;

public class task5_91 {

    public static double sumFactFunc(int x) {
        double factorial = 1;
        double sum = 0;
        double sqrt = 0;
        for (int i = 1; i <= x; i++) {
            factorial *= i;
            sqrt += Math.pow(x, i);
            sum += 1 + (sqrt / factorial);
        }
        return sum;
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println(df.format(sumFactFunc(3)));
    }
}

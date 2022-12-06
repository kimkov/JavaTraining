package trainingTasks;

import java.text.DecimalFormat;

public class task5_73_b {

    public static void areaCount(int x) {
        double land = 100;
        DecimalFormat df = new DecimalFormat("###.##");

        for (int i = 1; i <= x && i <= 3; i++) {
            land += land * 0.05;
        }
        for (int i = 4; i <= x && i <= 7; i++) {
            land += land * 0.05;
            System.out.println("Area for the " + i + " year is " + df.format(land) + " acres");
        }
    }

    public static void main(String[] args) {
        areaCount(7);
    }
}

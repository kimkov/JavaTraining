package trainingTasks;

import java.text.DecimalFormat;

public class task5_73_a {

    public static void harvestCount(int x) {
        double land = 100;
        double pHarvest = 20;

        DecimalFormat df = new DecimalFormat("###.##");

        for (int i = 1; i <= x; i++) {
            land += land * 0.05;
            pHarvest += pHarvest * 0.02;
            System.out.println("area in the " + i + " year is  " + df.format(land) + " and harvest is " + df.format(pHarvest) + " tonnes");
        }
    }

    public static void main(String[] args) {
        harvestCount(8);
    }
}

package trainingTasks;

import java.text.DecimalFormat;             // 133

public class task5_73_v {

    public static void harvestCount(int x) {
        double harvest = 20;
        double total = 0;
        DecimalFormat df = new DecimalFormat("###.##");

        for (int i = 1; i <= x; i++) {
            harvest += harvest * 0.02;
            total += harvest;
        }
        System.out.println("Harvest for the " + x + " years is " + df.format(total) + " tonnes");
    }

    public static void main(String[] args) {
        harvestCount(6);
    }
}

package trainingTasks;

import java.text.DecimalFormat;

public class task5_8 {

    public static void printTable() {
        int i;
        double x;
        java.text.DecimalFormat df = new DecimalFormat("#.###");

        for (i = 1; i <= 10; i++) {
            x = i * 0.453;

            System.out.println(i + " pounds is equal to " + df.format(x) + " kilos");
        }
    }

    public static void main(String[] args) {
        printTable();
    }
}

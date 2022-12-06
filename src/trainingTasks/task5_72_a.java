package trainingTasks;

public class task5_72_a {

    public static void countDist(int x) {
        double p = 10000;
        int days = 0;
        for (int i = 0; i < x; i++) {
            days += 1;
            p += p * 0.10;
            System.out.format("Distance for the " + days + " day is - " + "%.2f\n",p / 1000);
        }
    }

    public static void main(String[] args) {
        countDist(7);
    }
}

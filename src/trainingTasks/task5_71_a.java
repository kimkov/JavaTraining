package trainingTasks;

public class task5_71_a {

    public static double sumOfInterest(int x) {
        double s = 1000;
        for (int i = 0; i < x; i++) {
            s += (s / 100) * 2;
        }
        return s - 1000;
    }

    public static void main(String[] args) {
        System.out.format("%.2f", sumOfInterest(2));
    }
}

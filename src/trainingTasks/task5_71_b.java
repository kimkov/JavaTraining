package trainingTasks;

public class task5_71_b {

    public static void proOtSum(int x) {
        double result = 1000;
        for (int i = 0; i < x; i++) {
            result += (result / 100) * 2;
        }
        System.out.format("%.2f", result);
    }

    public static void main(String[] args) {
        proOtSum(3);
    }
}

package trainingTasks;

public class task5_28_a {

    public static double mNum() {
        int i;
        double result = 1;
        for (i = 1; i <= 15; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Multiplication of all numbers is: " + mNum());
    }
}

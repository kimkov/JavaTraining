package trainingTasks;

public class task6_4 {

    public static int amountOfNegativeNum(double [] x) {
        int i = 0, result = 0;
        do {
            result += 1;
            i++;
        } while (x[i] < 0);
        return result;
    }

    public static void main(String[] args) {
        double[] x = {-1.2, -5.1, 3.3, 8.4, 9.9, 5,7};

        System.out.println(amountOfNegativeNum(x));
    }
}

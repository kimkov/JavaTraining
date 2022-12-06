package trainingTasks;

public class task6_2 {

    public static double arithmeticNum(int [] x) {
        int i, sum = 0;
        int result;
        int l = x.length;
        for (i = 0; i <= l; i++) {
            if (x[i] < 1) {
                sum += 0;
                l -= 1;
            } else {
                sum += x[i];
            }
        }
        result = sum / l;
        return result;
    }

    public static void main(String[] args) {
        int[] x = {3, 7, -2, 1, 12, 9, -4};

        System.out.println("The average arithmetic sum of all positive numbers is - " + arithmeticNum(x));
    }
}

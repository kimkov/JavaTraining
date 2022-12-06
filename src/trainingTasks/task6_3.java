package trainingTasks;

public class task6_3 {

    public static int countOddNumbers(double[] x) {
        int i = 0;
        do {
            i++;
        } while (x[i] % 2 != 0);
        return i;
    }

    public static void main(String[] args) {
        double[] x = {1.2, 5.1, 3.3, 8.4, 9.9, 5,7};
        System.out.println("The amount of the odd numbers is - " + countOddNumbers(x));
    }
}

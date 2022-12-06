package trainingTasks;

public class task5_89_sum {

    public static int sumFact(int x) {
        int factorial = 1, sum = 0;
        for (int i = 1; i <= x; i++) {
            factorial *= i;
            sum += factorial;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumFact(2));
    }
}

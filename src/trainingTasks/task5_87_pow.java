package trainingTasks;

public class task5_87_pow {

    public static void squareNum(int x) {
        int square = 1;
        int result = 0;
        for (int i = 0; i <= x; i++) {
           square = square + (2 * i - 1);
           result += square;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        squareNum(4);
    }
}

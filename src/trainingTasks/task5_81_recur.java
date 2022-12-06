package trainingTasks;

public class task5_81_recur {                       // 136

    public static int multiplyRecur(int x, int y) {
        if ((x == 0) || (y == 0)) {
            return 0;
        } else {
            return (x + multiplyRecur(x, y - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println(multiplyRecur(2, 3));
    }
}

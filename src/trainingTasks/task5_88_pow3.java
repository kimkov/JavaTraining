package trainingTasks;

public class task5_88_pow3 {                    // 141

    public static int mathPow3(int x, int y) {
        if (y == 1) {
            return x;
        } else {
            return x * mathPow3(x, y - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(mathPow3(5, 3));
    }
}

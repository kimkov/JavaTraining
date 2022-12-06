package trainingTasks;

public class task3_12 {

    public static boolean mathFunc1 (int x, int y) {
        boolean a;

        a = Math.pow(x, 2) - Math.pow(y, 2) <= 0;
        return a;
    }

    public static boolean mathFunc2 (int x, int y) {
        boolean n;

        n = ((x % 2 != 0) && (y % 2 != 0));
        return n;
    }
    public static void main(String[] args) {
        System.out.println("Solution of task 3_12_a - " + mathFunc1(1, -1));
        System.out.println("Solution of task 3_29_a - " + mathFunc2(2, 5));
    }
}

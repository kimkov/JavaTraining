package trainingTasks;

public class task3_11 {

    public static boolean mathFunc(int x, int y) {      // Solution of the task 3_11_a
        boolean a;

        a = (Math.pow(x, 2) + Math.pow(y, 2)) <= 4;
        return a;
    }

    public static boolean mathFunc2(int x, int y) {     // Solution of the task 3_11_b
        boolean c;

        c = (x >= 0) || (Math.pow(y, 2) != 4);
        return c;
    }

    public static boolean mathFunc3(int x, int y) {     // Solution of the task 3_11_v
        boolean b;

        b = (x >= 0) && (Math.pow(y, 2) != 4);
        return b;
    }

    public static boolean mathFunc4(int x, int y) {
        boolean v;

        v = (x * y != 0) && (y > x);
        return v;
    }

    public static void main(String[] args) {
        System.out.println("Solution of task 3_11_a - " + mathFunc(3, -1));
        System.out.println("Solution of task 3_11_b - " + mathFunc2(1, 3));
        System.out.println("Solution of task 3_11_v - " + mathFunc3(1, 2));
        System.out.println("Solution of task 3_11_g - " + mathFunc4(2, 1));
    }
}

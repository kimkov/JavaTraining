package trainingTasks;

public class task5_67_a {                   // 122

    public static int fNum(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fNum(n - 1) + fNum(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fNum(15));
    }
}

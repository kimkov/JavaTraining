package trainingTasks;

public class task5_86 {                     // 139

    public static int squareOfNum(int x) {
        int result = 1;
        for (int i = 0; i <= x; i++) {
            result = result + (2 * i - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(squareOfNum(5));
    }
}

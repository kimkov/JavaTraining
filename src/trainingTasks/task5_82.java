package trainingTasks;

public class task5_82 {

    public static int factNum(int x) {
        int result = 1;

        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(factNum(4));

    }
}

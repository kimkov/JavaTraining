package trainingTasks;

public class task5_81_add {

    public static int multiplyFunc1(int x, int y) {
        int result = 0;
        for (int i = 0; i < x; i++) {
            result += y;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiplyFunc1(2, 3));
    }
}

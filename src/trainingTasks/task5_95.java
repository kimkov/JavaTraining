package trainingTasks;

public class task5_95 {

    public static int sumOfLastNum(int x, int y) {
        int result = 0;
        while (y != 0) {
            result += x % 10;
            x = x / 10;
            y -= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumOfLastNum(123457, 3));
    }
}

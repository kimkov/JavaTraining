package trainingTasks;

public class task5_94 {

    public static int sumOfNum(int x) {
        int result = 0;
        while (x != 0) {
            result += x % 10;
            x /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNum(123456));
    }
}

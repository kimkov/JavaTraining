package trainingTasks;

public class task5_27_a {

    public static int addNum() {
        int i, result = 0;
        for (i = 100; i <= 500; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Sum of numbers is - " + addNum());
    }
}

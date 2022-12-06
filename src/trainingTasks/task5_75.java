package trainingTasks;

public class task5_75 {

    public static void multiplierFunc(int a, int b) {
        int result = 1;
        for (int j = 0; j < 10; j++) {
            j += 1;
            for (int i = 0; i < b; i++) {
                result *= a;
                System.out.println(result);
            }
        }
    }

    public static void main(String[] args) {
        multiplierFunc(2, 2);
    }
}

package trainingTasks;

import java.io.IOException;

public class task5_28_a_rec {

    public static int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n - 1);
        return result;
    }

    public static void main(String[] args) throws IOException {

        System.out.println(factorial(14));
    }
}

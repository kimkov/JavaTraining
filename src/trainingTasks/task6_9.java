package trainingTasks;

class FirstBig {
    int i = 0;
    int result = 0;

    int FirstBigNum(int[] x, int n) {
        while (i < x.length) {
            if (x[i] > n) {
                result = x[i];
                return result;
            }
            i++;
        }
        return result;
    }
}

public class task6_9 {

    public static void main(String[] args) {
        int[] x = {1, 4, 23, 10, 3, 6, 16, 2, 9, 24};
        int n = 5;

        FirstBig df = new FirstBig();

        System.out.println(df.FirstBigNum(x, n));
    }
}

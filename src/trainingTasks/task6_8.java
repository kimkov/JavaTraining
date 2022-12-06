package trainingTasks;

class filterNum {
    int i = 0;
    int result = 0;

    void FilNum(int[] x, int n) {
        while (i < x.length) {
            if (x[i] < n) {
                result = x[i];
                System.out.print(x[i] + " ");
                i++;
            } else if (x[i] >= n) {
                result = 0;
                i++;
            }
        }
    }
}

    public class task6_8 {

        public static void main(String[] args) {
            int[] x = {1, 4, 23, 10, 3, 6, 16, 2, 9, 24};
            int n = 7;

            filterNum f = new filterNum();
            f.FilNum(x, n);
        }
    }

package trainingTasks;

class FuncWithN {                           // 157
    int i;
    int result = 0;

    void FuncWithN1 (int n) {
        for (i = 0; result < n; i++) {
            result = (int) Math.pow(i, 2);
            if (result <= n) {
                System.out.print(i + " ");
            } else {
                break;
            }
        }
    }

    int FuncWithN2 (int n) {
        while (!(result > n)) {
            result = (int) Math.pow(i, 2);
            if (result > n) {
                return i;
            }
            i++;
        }
        return i;
    }
}

public class task6_10 {

    public static void main(String[] args) {
        int n = 8;

        FuncWithN df = new FuncWithN();
        FuncWithN rt = new FuncWithN();
        df.FuncWithN1(n);

        System.out.println(" ");
        System.out.println(rt.FuncWithN2(n));
    }
}

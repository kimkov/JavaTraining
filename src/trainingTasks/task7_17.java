package trainingTasks;

import java.util.Arrays;                        // 200

class SumDivN {
    int[] arr;
    int n;

    SumDivN(int[] arr, int n) {
        this.arr = arr;
        this.n = n;
    }

    int GetSumDivN() {
        return Arrays.stream(arr).filter(x -> x % n == 0).reduce(0, Integer::sum);
    }
}

public class task7_17 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 15, 5, 3, 6, 7, 9, 12};
        int n = 3;

        SumDivN dn = new SumDivN(arr, n);
        System.out.println(dn.GetSumDivN());
    }
}

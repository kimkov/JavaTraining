package trainingTasks;

import java.util.Arrays;                // 199
class SumEvenNum {
    int[] arr;

    SumEvenNum(int[] arr) {
        this.arr = arr;
    }

    int GetSumE(int[] arr) {
        return Arrays.stream(arr).filter(x -> x % 2 == 0).reduce(0, Integer::sum);
    }
}

public class task7_16 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 5, 3, 6, 7, 9, 12};

        SumEvenNum se = new SumEvenNum(arr);
        System.out.println(se.GetSumE(arr));
    }
}

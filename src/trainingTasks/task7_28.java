package trainingTasks;

import java.util.Arrays;                                // 208

class NumOPFunc {
    private final int[] arr;
    private final int p;
    private final int k;

    NumOPFunc(int[] arr, int p, int k) {
        this.arr = arr;
        this.k = k;
        this.p = p;
    }

    int GetNumP() {
        return (int) Arrays.stream(arr).filter(x -> x > p).count();
    }

    int GetDivFive() {
        return (int) Arrays.stream(arr).filter(x -> x % 10 == 5).count();
    }

    int GetDivK() {
        return (int) Arrays.stream(arr).filter(x -> x % k == 0).count();
    }
}

public class task7_28 {
    public static void main(String[] args) {
        int[] arr = new int[] {23, 12, 53, 6, 9, 11, 15};
        int p = 12;
        int k = 3;

        NumOPFunc nf = new NumOPFunc(arr, p, k);
        NumOPFunc nv = new NumOPFunc(arr, p, k);
        NumOPFunc nd = new NumOPFunc(arr, p, k);

        System.out.println("Amount of numbers which greater than " + p + " - " + nf.GetNumP());
        System.out.println("Amount of numbers which ends with 5 - " + nv.GetDivFive());
        System.out.println("Amount of numbers which div by " + k + " - " + nd.GetDivK());
    }
}

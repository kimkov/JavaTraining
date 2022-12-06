package trainingTasks;

import java.util.Arrays;

class SumItems {
    private int[] arr;
    private int x;

    public SumItems(int[] arr, int x) {
        this.arr = arr;
        this.x = x;
    }
    public SumItems() {

    }

    public void SetArr(int[] arr) {
        this.arr = arr;
    }

    public void SetX(int x) {
        this.x = x;
    }

    public int[] getArr() {
        return arr;
    }

    public int getX() {
        return x;
    }

    int GetSumItems() {
        return Arrays.stream(arr).filter(x -> x > 1000).reduce(0, Integer::sum);
    }
}

public class task7_21 {
    public static void main(String[] args) {
        int[] arr = new int[]{1340, 400, 1521, 500, 3356, 600, 732, 989, 1245, 1000};
        int x = 1000;

        SumItems si = new SumItems(arr, x);
        System.out.println(si.GetSumItems());
    }
}

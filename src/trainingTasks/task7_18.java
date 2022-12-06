package trainingTasks;

class SumSec {                          // 201
    int[] arr;
    int result = 0;

    SumSec(int[] arr) {
        this.arr = arr;
    }

    int GetSumSec() {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 ) {
                result += arr[i];
            }
        }
        return result;
    }
}

public class task7_18 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 15, 5, 3, 6, 7, 9, 12};

        SumSec sm = new SumSec(arr);
        System.out.println(sm.GetSumSec());
    }
}

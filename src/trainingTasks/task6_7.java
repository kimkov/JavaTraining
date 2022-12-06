package trainingTasks;

class MultiplyNum {                                 // 154

    private int result = 1;

    void FuncMultiplyNum(int[] arr) {
        int i;
        for (i = 0; i < arr.length; i++) {
            result *= arr[i];
            System.out.print(result + " ");
        }
    }
}

public class task6_7 {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 6, 7, 8, 1, 11, 0};

        MultiplyNum df = new MultiplyNum();
        df.FuncMultiplyNum(arr);
    }
}
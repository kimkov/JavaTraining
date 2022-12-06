package trainingTasks;

class FindNeg {
    int[] arr;
    int ind;

    FindNeg(int[] arr) {
        this.arr = arr;
    }

    int GetNeg(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
               ind = i;
               break;
            }
        }
        return ind;
    }
}

public class task6_58 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, -5, 4, 9, 10, -12, 13, 17};

        FindNeg fn = new FindNeg(arr);
        System.out.println(fn.GetNeg(arr));
    }
}

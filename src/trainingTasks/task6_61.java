package trainingTasks;

class FindDiv {
    int[] arr;
    int result;

    FindDiv(int[] arr) {
        this.arr = arr;
    }

    int GetFindDiv() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 7 == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}

public class task6_61 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 14, -5, 4, 9, 76, 7, -12, 13, 17};

        FindDiv fd = new FindDiv(arr);
        System.out.println(fd.GetFindDiv());
    }
}

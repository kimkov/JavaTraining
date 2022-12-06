package trainingTasks;

import java.util.stream.IntStream;

class FindLast7 {               // 188
    int[] arr;
    int result;

    FindLast7(int[] arr) {
        this.arr = arr;
    }

    int GetLast7(int[] arr) {
        return (int) IntStream.of(arr).filter(w -> (w % 10) == 7).count();
    }

    int GetL7(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 7) {
                result = i;
                break;
            }
        }
        return result;
    }
}

public class task6_60 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, -5, 4, 9, 76, 10, 7, -12, 13, 17};

        FindLast7 lf = new FindLast7(arr);
        FindLast7 lt = new FindLast7(arr);

        System.out.println(lf.GetLast7(arr));
        System.out.println(lt.GetL7(arr));
    }
}

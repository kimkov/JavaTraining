package trainingTasks;

class CountEv {                             // 217
    private final int[] arr;
    private int result;
    private int ind;

    CountEv(int[] arr) {
        this.arr = arr;
    }

    int GetEvArithmetic() {
        for (int i : arr) {
            if (i % 2 == 0) {
                result += i;
                ind += 1;
            }
        }
        return result / ind;
    }
}

public class task7_45 {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 12, 24, 1, 7, 9, 15, 10, 3};

        CountEv ev = new CountEv(arr);

        System.out.println(ev.GetEvArithmetic());
    }
}

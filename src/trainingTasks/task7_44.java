package trainingTasks;

class CountNZ {                                     // 216
    private final int[] arr;
    private final int n;
    private int ind;
    private int result;

    CountNZ(int[] arr, int n) {
        this.arr = arr;
        this.n = n;
    }

    int GetArithmetic() {
        for (int i : arr) {
            if (i > n) {
                result += i;
                ind += 1;
            }
        }
        return result / ind;
    }
}

public class task7_44 {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 12, 24, 1, 7, 9, 15, 10, 3};
        int n = 11;

        CountNZ nz = new CountNZ(arr, n);
        System.out.println(nz.GetArithmetic());
    }
}

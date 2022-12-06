package trainingTasks;

class CountS {                                  // 213
    private final int[] arr;
    private int n = 0;

    CountS(int[] arr) {
        this.arr = arr;
    }

    int GetCountS() {
        int i = 0;
        do {
            if ((arr[i] > 0) && (arr[i + 1] < 0)) {
                n += 1;
            } else if ((arr[i] < 0) && (arr[i + 1] > 0)) {
                n += 1;
            }
            i++;
        } while (i < arr.length - 1);
        return n;
    }
}

public class task7_37 {
    public static void main(String[] args) {
        int[] arr = new int[] {10, -4, 12, 4, -7, 9, 6};

        CountS cd = new CountS(arr);
        System.out.println(cd.GetCountS());
    }
}

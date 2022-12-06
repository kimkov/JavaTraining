package trainingTasks;

class NNum {                                // 211
    private final int[] arr;

    private int n;

    NNum(int[] arr) {
        this.arr = arr;
    }

    int GetEqualN() {
        int i = 0;
        do {
            if (arr[i] == arr[i + 1]) {
                n += 1;
            }
            i++;
        } while (i < arr.length - 1);
        return n;
    }

    int GetEqualZ() {
        int i = 0;
        do {
            if ((arr[i] == 0) && (arr[i + 1] == 0)) {
                n += 1;
            }
            i++;
        } while (i < arr.length - 1);
        return n;
    }

    int GetEvenN() {
        int i = 0, a, b;
        do {
            a = arr[i] % 2;
            b = arr[i + 1] % 2;
            if ((a == 0) && (b == 0) && (arr[i] > 0) && (arr[i + 1] > 0)) {
                n += 1;
            }
            i++;
        } while (i < arr.length - 1);
        return n;
    }

    int GetFiveL() {
        int i = 0;
        do {
            if ((arr[i] % 10 == 5) && (arr[i + 1] % 10 == 5) && (arr[i] == arr[i + 1])) {
                n += 1;
            }
            i++;
        } while (i < arr.length - 1);
        return n;
    }
}

public class task7_35 {
    public static void main(String[] args) {
        int[] arr = new int[] {23, 12, 12, 0, 0, 9, 9, 11, 15, 15};

        NNum nm = new NNum(arr);
        NNum zn = new NNum(arr);
        NNum en = new NNum(arr);
        NNum fl = new NNum(arr);

        System.out.println(nm.GetEqualN());
        System.out.println(zn.GetEqualZ());
        System.out.println(en.GetEvenN());
        System.out.println(fl.GetFiveL());
    }
}

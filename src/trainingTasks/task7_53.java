package trainingTasks;

class FindNumMM {                                   // 218
    private final int[] arr;
    private int ind;

    FindNumMM(int[] arr) {
        this.arr = arr;
    }

    int GetMaxN() {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                ind = i;
            } else if (max == arr[i]) {
                ind = i;
            }
        }
        return ind;
    }

    int GetMinN() {
        int i = 0;
        int min = arr[i];
        do {
            if (min > arr[i]) {
                min = arr[i];
                ind = i;
            }
            i++;
        } while (i < arr.length);
        return ind;
    }
}

public class task7_53 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 12, 8, 1, 7, 9, 15, 1, 10, 3};

        FindNumMM fm = new FindNumMM(arr);
        FindNumMM mn = new FindNumMM(arr);

        System.out.println("Index of biggest element is - " + fm.GetMaxN());
        System.out.println("Index of min element is - " + mn.GetMinN());
    }
}

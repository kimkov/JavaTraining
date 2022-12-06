package trainingTasks;

class NeighborB {                                   // 212
    private final double[] arr;
    private int n;

    NeighborB(double[] arr) {
        this.arr = arr;
    }

    int GetNeighborB() {
        int i = 0;
        double a, b , v;
        do {
            a = arr[i];
            b = arr[i + 1];
            v = arr[i + 2];
            if ((a > 0) && (b > 0) && (v > 0)) {
                if ((a < b) && (b > v)) {
                    n += 1;
                }
                i++;
            } else {
                break;
            }
            i++;
        } while (i < arr.length - 1);
        return n;
    }
}

public class task7_36 {
    public static void main(String[] args) {
        double[] arr = new double[] {123, 45.5, 14.7, 345.5, 98.8, 111.4, 12};

        NeighborB nb = new NeighborB(arr);

        System.out.println(nb.GetNeighborB());
    }
}

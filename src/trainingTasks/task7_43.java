package trainingTasks;

class CountArithmetic {                                 // 215
    private final double[] arr;
    private int ind = 0;
    private double s = 0;

    CountArithmetic(double[] arr) {
        this.arr = arr;
    }

    double GetArithmetic() {
        int i = 0;
        do {
            if (arr[i] > 10) {
                s += arr[i];
                ind += 1;
            }
            i++;
        } while (i < arr.length);
        return s / ind;
    }
}

public class task7_43 {
    public static void main(String[] args) {
        double[] arr = new double[] {2.4, 12.3, 24.8, 16.9, 7.8, 9.2, 15.6};

        CountArithmetic ca = new CountArithmetic(arr);
        System.out.println(ca.GetArithmetic());
    }
}

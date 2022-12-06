package trainingTasks;

import java.util.Arrays;

class CountSD {
    private final double[] arr;

    CountSD(double[] arr) {
        this.arr = arr;
    }

    int GetCountSD() {

        return (int) Arrays.stream(arr).filter(x -> x < 100).count();
    }
}

public class task7_27 {
    public static void main(String[] args) {
        double[] arr = new double[] {123, 45.5, 14.7, 345.5, 98.8, 111.4};

        CountSD sd = new CountSD(arr);
        System.out.println(sd.GetCountSD());
    }
}

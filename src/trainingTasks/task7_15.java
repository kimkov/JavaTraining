package trainingTasks;

import java.util.Arrays;

class SumIntNum {
    double[] arr;
    int p;
    double result = 0;

    SumIntNum(double[] arr, int p) {
        this.arr = arr;
        this.p = p;
    }

    double GetSumIntD(double[] arr, int p) {
        for (double i : arr) {
            if (i > p) {
                result += i;
            }
        }
        return result;
    }

    double GetSumStr(double[] arr, int p) {
        return Arrays.stream(arr).filter(x -> x > p).reduce(0, Double::sum);
    }
}

public class task7_15 {
    public static void main(String[] args) {
        double[] arr = new double[]{3.4, 8.2, 9.7, 4.7, 7.6, 5.1};
        int p = 5;

        SumIntNum sm = new SumIntNum(arr, p);
        SumIntNum ss = new SumIntNum(arr, p);
        System.out.println(sm.GetSumIntD(arr, p));
        System.out.println(ss.GetSumStr(arr, p));
    }
}

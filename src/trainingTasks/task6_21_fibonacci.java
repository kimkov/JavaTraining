package trainingTasks;

import java.util.Arrays;
import java.util.stream.Stream;

class FibonacciNum {
    int[] FuncFibonacci(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }
}

class FibonacciNumStream {

    void FunFibonacciStream(int n) {
        Stream.iterate(new int[]{1, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
                .limit(n)
                .map(y -> y[0])
                .forEach(x -> System.out.print(x + " "));
    }
}

class FirstBigNumN {
    private int result = 0;
    private int i = 0;

    int FuncFirstNumN(int n, int[] arr) {
        while (!(arr[i] > n)) {
            i++;
            result = arr[i];
        }
        return result;
    }
}

class SumOfNum {
    private int resultS = 0;

    int FuncSumOfNum(int[] arr) {
        int i = 0;
        while (arr[i] <= 1000) {
            resultS += arr[i];
            i++;
        }
        return resultS;
    }
}

public class task6_21_fibonacci {
    public static void main(String[] args) {
        int n = 23;
        FibonacciNum df = new FibonacciNum();
        FibonacciNumStream rt = new FibonacciNumStream();
        FirstBigNumN sd = new FirstBigNumN();
        SumOfNum sn = new SumOfNum();

        int[] arr = df.FuncFibonacci(n);

        System.out.println(Arrays.toString(df.FuncFibonacci(n)));
        rt.FunFibonacciStream(n);
        System.out.println(" ");
        System.out.println("First number which greater than " + n + " is - " + sd.FuncFirstNumN(n, arr));
        System.out.println("Sum of all numbers which smaller than 1000 is - " + sn.FuncSumOfNum(arr));
    }
}

package trainingTasks;

import java.io.BufferedReader;                          // 219
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class BestResult {
    private final ArrayList<Integer> arr;

    BestResult(ArrayList<Integer> arr) {
        this.arr = arr;

    }

    int GetResult() {
        int max = 0;
        for (int i : arr) {
            if ((i < max) || (max == 0)) {
                max = i;
            }
        }
        return max;
    }
}

public class task7_55 {
    public static void main(String[] args) throws IOException {
        int a;
        ArrayList<Integer> arr = new ArrayList<>();
        do {
            BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter results in seconds: ");
            a = Integer.parseInt(myNum.readLine());

            arr.add(a);

            BestResult bs = new BestResult(arr);

            System.out.println("Best result is : " + bs.GetResult());

        } while (a != 0);



    }
}

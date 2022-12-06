package trainingTasks;

import java.util.ArrayList;

class FindNum {                         // 181
    private int y = 0;


    ArrayList<Integer> GetSum() {
        ArrayList<Integer> sum = new ArrayList<>();
        int x = 30;
        while (x < 100) {
            int v = x + 1;
            if ((x + v) % 3 == 0) {
                y = x + v;
            } else if (((y % 10) == 2) || ((y % 10) == 4) || ((y % 10) == 8) || (y % 10) == 7) {
                sum.add(y);
            }
            x += 1;
        }
        return sum;
    }
}

public class task7_12 {
    public static void main(String[] args) {
        FindNum fn = new FindNum();
        System.out.println(fn.GetSum());
    }
}

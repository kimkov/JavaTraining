package trainingTasks;

class MaxMin {                          // 162
    private int max;
    private int min;

    int GetMax(int x) {
        while (x > 0) {
            int d = x % 10;
            x /= 10;
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    int GetMin(int x) {
        while (x > 0) {
            int p = x % 10;
            x /= 10;
            if ((p < min) || (min == 0)) {
                min = p;
            }
        }
        return min;
    }
}

public class task6_26 {
    public static void main(String[] args) {
        int x = 1345967;

        MaxMin b = new MaxMin();
        MaxMin m = new MaxMin();

        System.out.println("MAX number is - " + b.GetMax(x));
        System.out.println("MIN number is - " + m.GetMin(x));
    }
}

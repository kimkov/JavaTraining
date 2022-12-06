package trainingTasks;

class CountMax {                            // 167
    int x;
    int result, i, max, p;

    CountMax(int x) {
        this.x = x;
    }

    int GetCountMax() {
        while (x > 0) {
            i++;
            p = x % 10;
            if (p > max) {
                max = x % 10;
                result = 1;
            } else if ((p == max)) {
                result += 1;
            }
            x /= 10;
        }
        return result;
    }
}

public class task6_31 {
    public static void main(String[] args) {
        int x = 2457;
        CountMax mx = new CountMax(x);
        System.out.println("Max num repeats - " + mx.GetCountMax() + " times");
    }
}

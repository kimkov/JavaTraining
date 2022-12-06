package trainingTasks;

class CountFirst {
    int p, min, count;

    int GetCountFirst(int x) {
        while (x > 0) {
            p = x % 10;
            if ((p < min)) {
                min = x % 10;
                count = 1;
            } else if (p == min) {
                count += 1;
            } else {
                min = p;
            }
            x /= 10;
        }
        return count;
    }
}

public class task6_38 {
    public static void main(String[] args) {
        int x = 223452;

        CountFirst cf = new CountFirst();
        System.out.println(cf.GetCountFirst(x));
    }
}

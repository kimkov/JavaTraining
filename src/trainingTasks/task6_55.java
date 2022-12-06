package trainingTasks;

class FindNum55 {                       // 185
    int x, n, a;
    boolean r;

    FindNum55(int x) {
        this.x = x;
    }

    boolean GetNum55() {
        r = false;
        while (x > 0) {
            n = x % 10;
            x /= 10;
            a = x % 10;
            if (n <= a) {
                r = false;
                break;
            } else {
                r = true;
            }
        }
        return r;
    }
}

public class task6_55 {
    public static void main(String[] args) {
        int x = 12345;
        FindNum55 fn = new FindNum55(x);
        System.out.println(fn.GetNum55() ? "OK" : "NOT OK");
    }
}

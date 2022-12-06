package trainingTasks;

class NumOP {                           // 196
    int x, a, rev;

    NumOP(int x, int a) {
        this.x = x;
        this.a = a;
    }

    int GetRevNum() {
        do {
            rev = rev * 10 + (x % 10);
            x /= 10;
        } while (x > 0);
        return rev;
    }

    int GetDelNum() {
        int r, r1 = 0;
        do {
            r = x % 10;
            x /= 10;
            if (r == a) {
                continue;
            } r1 = r1 * 10 + r;
        } while (x > 0);
        return r1;
    }
}

public class task6_110 {
    public static void main(String[] args) {
        int x = 123345;
        int a = 3;

        NumOP np = new NumOP(x, a);
        NumOP dn = new NumOP(x, a);

        System.out.println(np.GetRevNum());
        System.out.println(dn.GetDelNum());
    }
}

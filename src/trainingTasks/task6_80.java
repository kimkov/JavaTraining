package trainingTasks;

class NumComp {                         // 195
    int x;

    NumComp(int x) {
        this.x = x;
    }

    void GetNumComp() {
        int z = 0, z1 = 0;
        do {
            int n = x % 10;
            x /= 10;
            int n1 = x % 10;
            if (n == 0) {
                z += 1;
            } else if (n1 == 9) {
                z1 += 1;
            }
        } while (x > 0);
        if (z > z1) {
            System.out.println("0 appear more than 9");
        } else {
            System.out.println("9 appear more than 0");
        }
    }
}

public class task6_80 {
    public static void main(String[] args) {
        int x = 219000;

        NumComp nc = new NumComp(x);
        nc.GetNumComp();
    }
}

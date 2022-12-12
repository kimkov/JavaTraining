package trainingTasks;

class Oa {
    int i, j;
    Oa(int a, int b) {
        i = a;
        j = b;
    }
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class Ob extends Oa {
    int k;
    Ob(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show(String msg) {
        System.out.println(msg + k);
    }
}

public class AOverRide {
    public static void main(String[] args) {
        Ob subOb = new Ob(19, 26, 33);

        subOb.show("This is K: ");
        subOb.show();
    }
}

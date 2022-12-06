package trainingTasks;

class TestAccess {
    int a;
    private int b;
    private int c;

    void setB(int j) {
        b = j;
    }

    int getB() {
        return b;
    }

    void setC(int i) {
        c = i;
    }

    int getC() {
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        TestAccess ob = new TestAccess();

        ob.a = 10;
        ob.setB(15);
        ob.setC(100);

        System.out.println("a & b & c: " + ob.a + " " + ob.getB() + " " + ob.getC());
    }
}

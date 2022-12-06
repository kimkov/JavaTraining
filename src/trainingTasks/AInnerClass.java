package trainingTasks;

class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("Inner class: " + outer_x);
        }
    }
}

public class AInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}

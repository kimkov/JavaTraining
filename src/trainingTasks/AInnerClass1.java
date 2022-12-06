package trainingTasks;

class Outer1 {
    int outer_x = 120;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println("Variable outer_x: " + outer_x);
                }
            }
            Inner innerV = new Inner();
            innerV.display();
        }
    }
}

public class AInnerClass1 {
    public static void main(String[] args) {
        Outer1 o1 = new Outer1();
        o1.test();
    }
}

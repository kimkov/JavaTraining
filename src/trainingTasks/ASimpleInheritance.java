package trainingTasks;

class A {
    int i, j;

    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    void showK() {
        System.out.println("k: " + k);
    }
    void sum() {
        System.out.println("i + j + k: " + (i + j + k));
    }
}

public class ASimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        // суперкласс может использоваться самостоятельно
        superOb.i = 10;
        superOb.j = 20;

        System.out.println("SuperOb consist of: ");
        superOb.showij();
        System.out.println();

        /* Подкласс имеет доступ ко всем открытым членам своего суперкласса . */

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;

        System.out.println("SubOb consist of: ");

        subOb.showij();
        subOb.showK();

        System.out.println();
        System.out.println("Sum of i, j and k in SubOb: ");

        subOb.sum();
    }
}

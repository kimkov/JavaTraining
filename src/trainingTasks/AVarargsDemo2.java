package trainingTasks;

public class AVarargsDemo2 {

    static void vaTest(int ... v) {
        System.out.println("vaTest(int ...) : " + " Amount of arguments: " + v.length);

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean ... v) {
        System.out.println("vaTest (boolean ... ): " + "Amount of arguments: " + v.length);

        for (boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(String msg, int ... v) {
        System.out.println("vaTest(String, int ... v) : " + msg + v.length)  ;

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        vaTest(1, 2, 3);
        vaTest("Check : ", 10, 20);
        vaTest(true, false, false);
    }
}

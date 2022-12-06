package trainingTasks;

public class task5_5 {                  // 104

    public static void printTableA() {
        int i, j;
        for (i = 21, j = 19; i >= 10; i--, j--) {
            System.out.println(i + " " + j + ".2");
        }
    }

    public static void printTableB() {
        int i, j;
        for (i = 45, j = 44; i >= 25; i--, j--) {
            System.out.println(i + " " + j + ".5 " + j + ".2");
        }
    }

    public static void main(String[] args) {
        printTableA();
        printTableB();
    }
}

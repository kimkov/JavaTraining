package trainingTasks;

public class task5_6 {

    public static void printTableA() {
        int i, j;
        for (i = 21, j = 20; i <= 35; i++, j++) {
            System.out.println(i + " " + j + ".4");
        }
    }

    public static void printTableB() {
        int i, j;
        for (i = 16, j = 15; i <= 24; i++, j++) {
            System.out.println(i + " " + j + ".5 " + i + ".8");
        }
    }
    public static void main(String[] args) {
        printTableA();
        printTableB();
    }
}

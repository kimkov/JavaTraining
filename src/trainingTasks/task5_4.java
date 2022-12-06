package trainingTasks;

public class task5_4 {

    public static void printTableA() {
        int i;
        for (i = 9; i < 25; i++) {
            System.out.println((i + 1) + " " + (i + 1) + ".4");
        }
    }

    public static void printTableB() {
        int i;
        for (i = 24; i < 35; i++) {
            System.out.println((i + 1) + " " + (i + 1) + ".5 " +  i + ".8");
        }
    }

    public static void main(String[] args) {
        printTableA();
        printTableB();
    }
}

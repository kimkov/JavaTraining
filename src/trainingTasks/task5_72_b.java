package trainingTasks;

public class task5_72_b {                   // 130

    public static int runDist(int x) {
        int p = 10000;
        for (int i = 0; i < x; i++) {
            p += p * 0.10;
        }
        return p;
    }

    public static void main(String[] args) {
        System.out.println("Total distance after 7 days is - " + runDist(7));
    }
}

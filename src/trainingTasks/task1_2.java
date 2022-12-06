package trainingTasks;

public class task1_2 {

    static int logNum;

    public task1_2(int logNum) {
        task1_2.logNum = logNum;
    }

    public static void main(String[] args) {
        logNum = 10;

        System.out.format("%.3f\n", Math.log(logNum));
    }
}

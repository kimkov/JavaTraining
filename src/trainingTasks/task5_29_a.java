package trainingTasks;

public class task5_29_a {               // 121

    public static int arNum() {
        int i, result = 0;
        for (i = 0; i <= 100; i++) {
            result += i;
        }
        return result / 100;
    }
    public static void main(String[] args) {
        System.out.println("average arithmetic - " + arNum());
        }
    }

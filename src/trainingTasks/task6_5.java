package trainingTasks;

public class task6_5 {

    static int countNumInArr(int [] x) {
        int result = 0, i = 0;
        do {
            result += 1;
            i++;
        } while (x[i] == x[0]);
        return result;
    }

    public static void main(String[] args) {
        int[] x = new int[] {2, 2, 9, 5, 7, 23, 21, 8, 54, 34, 76};

        System.out.println("Sum of all first equals numbers is - " + countNumInArr(x));
    }
}

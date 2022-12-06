package trainingTasks;

public class task6_1 {

    public static int sumOfArray(int [] x) {
        int i;
        int result = 0;
        for (i = 0; i < x.length; i++) {
            result += x[i];
        }
        return result;
    }

    public static int countNumOfArray(int [] x) {
        int resultSum = 0;
        int i;
        for (i = 0; i < x.length; i++){
            if (i != 0) {
                resultSum += 1;
            } else {
                resultSum += 0;
            }
        }
        return resultSum;
    }

    public static void main(String[] args) {
        int[] x = {1, 23, 2, 7, 8, 9, 4, 0};
        System.out.println("Sum of all numbers is - " + sumOfArray(x));
        System.out.println("The amount of all numbers in array is - " + countNumOfArray(x));
    }
}

package trainingTasks;

class Find77 {
    int[] arr;
    int result;

    Find77(int[] arr) {
        this.arr = arr;
    }

    int GetFind77() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 77) {
               result = i;
               break;
            }
        }
        return result;
    }
}

public class task6_59 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, -5, 4, 9, 10, 77, -12, 13, 17};

        Find77 f7 = new Find77(arr);
        System.out.println(f7.GetFind77());
    }
}

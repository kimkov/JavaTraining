package trainingTasks;

class FindNumN {                                // 190
    int[] arr;
    int x, result = 0;

    FindNumN(int[] arr, int x) {
        this.arr = arr;
        this.x = x;
    }

    int GetFindNumN() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                result = i;
                break;
            }
        }
        return result;
    }
}

public class task6_62 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 4, 5, 9, 16, 17, 20, 33, 47};
        int x = 10;

        FindNumN fn = new FindNumN(arr, x);
        if (fn.GetFindNumN() == 0) {
            System.out.println("There is no number " + x);
        } else {
            System.out.println("Index is - " + fn.GetFindNumN());
        }
    }
}

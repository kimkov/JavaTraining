package trainingTasks;

class FindGrow {                            // 194
    int[] arr;
    int ind;

    FindGrow(int[] arr) {
        this.arr = arr;
    }

    void GetGrow() {
        for (int i = 0; i < arr.length - 1; i++) {
            int r1, r2;
            r1 = arr[i];
            r2 = arr[i + 1];
            if (r1 >= r2) {
                ind = i + 1;
                break;
            } else {
                ind = i;
            }
        }
        if (ind > 0) {
            System.out.println("index of the first wrong number " + ind);
        } else {
            System.out.println("This is grow array");
        }
    }
}

public class task6_69 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 4, 5, 4, 4, 7, 7, -12, 13, 9999};

        FindGrow fg = new FindGrow(arr);
        fg.GetGrow();
    }
}

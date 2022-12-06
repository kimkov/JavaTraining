package trainingTasks;

class FindDoubleOdd {
    int[] arr;
    int ind1, ind2, r1, r2;

    FindDoubleOdd(int[] arr) {
        this.arr = arr;
    }

    void GetDoubleOdd() {
        for (int i = 0; i < arr.length - 1; i++) {
            r1 = arr[i];
            r2 = arr[i + 1];
            if ((r1 % 2 != 0) && (r2 % 2 != 0) && (r1 == r2)) {
                ind1 = i;
                ind2 = i + 1;
                break;
            } else {
                ind1 = 0;
                ind2 = 0;
            }
        }
        if ((ind1 > 0) && (ind2 > 0)) {
            System.out.println(ind1 + " " + ind2);
        } else {
            System.out.println("NOPE");
        }
    }
}

public class task6_67 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 14, -5, 4, 3, 7, 7, -12, 13, 17};

        FindDoubleOdd fo = new FindDoubleOdd(arr);
        fo.GetDoubleOdd();
    }
}

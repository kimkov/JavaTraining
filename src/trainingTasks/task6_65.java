package trainingTasks;

class FindDouble {                          // 191
    int[] arr;
    int ind1, ind2;

    FindDouble(int[] arr) {
        this.arr = arr;
    }

    void GetDouble() {
        for (int i = 0; i < arr.length; i++) {
            int r = arr[i];
            int r1 = arr[i + 1];
            if (r == r1) {
                ind1 = i;
                ind2 = i + 1;
                System.out.println(ind1 + " " + ind2);
                break;
            }
        }
    }
}

public class task6_65 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 14, -5, 4, 9, 76, 7, 7, -12, 13, 17};

        FindDouble fd = new FindDouble(arr);
        fd.GetDouble();
    }
}

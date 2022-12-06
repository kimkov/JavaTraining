package trainingTasks;

class FindOddNum {                          // 193
    int[] arr;
    int ind1, ind2;

    FindOddNum(int[] arr) {
        this.arr = arr;
    }

    void GetOddNum() {
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr.length <= 2) || (arr[arr.length - 1] != 9999)) {
                System.out.println("Wrong array. It should have more than 2 elements and end with 9999");
                break;
            } else if ((arr[i] % 2 == 0) && (arr[i + 1] % 2 == 0) && arr[i] == arr[i + 1]) {
                ind1 = i;
                ind2 = i + 2;
                break;
            } else {
                ind1 = 0;
                ind2 = 0;
            }
        }
        if ((ind1 > 0) && (ind2 > 0)) {
            System.out.println(ind1 + " " + ind2);
        }
    }
}

public class task6_68 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 14, -5, 4, 4, 7, 7, -12, 13, 9999};

        FindOddNum fod = new FindOddNum(arr);
        fod.GetOddNum();
    }
}

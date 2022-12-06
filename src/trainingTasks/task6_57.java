package trainingTasks;

class FindN {                           // 185

    int num, ind, r, r1, ind1, ans, indAns;

    FindN(int num) {
        this.num = num;
    }

    void GetFindN() {
        int[] arr = new int[] {1, 3, 9, 10, 12, 13, 17};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                r = arr[i];
                ind = i;
                break;
            } else if (arr[i] < num) {
                r1 = arr[i];
                ind1 = i;
            }
        }
        if ((r - num) < (num - r1)) {
            ans = r;
            indAns = ind;
        } else {
            ans = r1;
            indAns = ind1;
        }

        System.out.println(r + " " + ind);
        System.out.println(r1 + " " + ind1);
        System.out.println(ans + " " + indAns);
    }
}
public class task6_57 {
    public static void main(String[] args) {
        int num = 14;
        FindN fn = new FindN(num);
        fn.GetFindN();

    }
}

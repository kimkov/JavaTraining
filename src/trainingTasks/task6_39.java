package trainingTasks;

import java.util.ArrayList;                 // 175

class FindSecond {
    int x, p, result;

    FindSecond(int x) {
        this.x = x;
    }
    int GetSecond() {
        if (x < 10) {
            return x;
        } else {
            do {
                p = x % 10;
                if (x / 10 > 0) {
                    result = p;
                }
                x /= 10;
            } while (x > 0);
            return result;
        }
    }
}

class FindSecondInArr {
    ArrayList<Integer> arr = new ArrayList<>();
    int x, t, num;

    FindSecondInArr(int x) {
        this.x = x;
    }

    int GetSecondNum() {
        if (x < 10) {
            return x;
        } else {
            while (x > 0) {
                t = x % 10;
                arr.add(t);
                x /= 10;
            }
            for (int ignored : arr) {
                num = arr.get(arr.size() - 2);
                break;
            }
            return num;
        }
    }
}

public class task6_39 {
    public static void main(String[] args) {
        int x = 1;

        FindSecond fs = new FindSecond(x);
        FindSecondInArr fa = new FindSecondInArr(x);

        System.out.println(fs.GetSecond());
        System.out.println(fa.GetSecondNum());
    }
}

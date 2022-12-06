package trainingTasks;

import java.util.ArrayList;

class FindThird {
    int x, p, num;

    FindThird(int x) {
        this.x = x;
    }

    int GetThird() {
        if (x < 100) {
            return x;
        } else {
            do {
                p = x % 10;
                if (x / 100 > 0) {
                    num = p;
                }
                x /= 10;
            } while (x > 0);
        }
        return num;
    }
}

class FindThirdArr {
    int x, p, result;
    ArrayList<Integer> arr = new ArrayList<>();

    FindThirdArr(int x) {
        this.x = x;
    }

    int GetThirdArr() {
        if (x < 100) {
            return x;
        } else {
            while (x > 0) {
                p = x % 10;
                arr.add(p);
                x /= 10;
            }
            for (@SuppressWarnings("unused") int i : arr) {
                result = arr.get(arr.size() - 3);
                break;
            }
        }
        return result;
    }
}

public class task6_40 {
    public static void main(String[] args) {
        int x = 12456;

        FindThird ft = new FindThird(x);
        FindThirdArr fh = new FindThirdArr(x);

        System.out.println(ft.GetThird());
        System.out.println(fh.GetThirdArr());
    }
}

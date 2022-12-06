package trainingTasks;

import java.util.HashMap;                                   // 214

class CountG {
    final private HashMap<Integer, Integer> arr;
    private int w, l, b;

    CountG(HashMap<Integer, Integer> arr) {
        this.arr = arr;
    }

    void GetG() {

        for (int i : arr.values()) {
            if (i == 3) {
                w += 1;
            } else if (i == 1) {
                b += 1;
            } else if (i == 0) {
                l += 1;
            }
        }
        System.out.println("win - " + w + " bite - " + b + " lose - " + l);
    }
}

public class task7_42 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> myArr = new HashMap<>();

        myArr.put(1, 3);
        myArr.put(2, 0);
        myArr.put(3, 1);
        myArr.put(4, 3);
        myArr.put(5, 3);
        myArr.put(6, 1);
        myArr.put(7, 0);
        myArr.put(8, 1);
        myArr.put(9, 3);
        myArr.put(10, 0);

        CountG cg = new CountG(myArr);

        cg.GetG();
    }
}

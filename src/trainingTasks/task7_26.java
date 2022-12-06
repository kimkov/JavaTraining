package trainingTasks;

import java.util.HashMap;                                   // 206

class CountTemp {
    private final HashMap<Integer, Integer> myTemp;

    CountTemp(HashMap<Integer, Integer> myTemp) {
        this.myTemp = myTemp;
    }

    int GetCountTemp() {
        int result = 0;
        for (int i : myTemp.values()) {
            if (i < 0) {
                result += 1;
            }
        }
        return result;
    }
}

public class task7_26 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> myTemp = new HashMap<>();

        myTemp.put(1, 12);
        myTemp.put(2, -1);
        myTemp.put(3, 3);
        myTemp.put(4, 7);
        myTemp.put(5, -3);
        myTemp.put(6, 2);
        myTemp.put(7, -10);
        myTemp.put(8, 4);
        myTemp.put(9, 6);
        myTemp.put(10, -1);

        CountTemp ct = new CountTemp(myTemp);
        System.out.println("Temperature drops down below zero - " + ct.GetCountTemp() + " times");
    }
}

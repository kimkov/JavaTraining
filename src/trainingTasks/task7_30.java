package trainingTasks;

import java.util.HashMap;                           // 210

class CountAges {
    private final HashMap<String, Integer> mySet;

    CountAges(HashMap<String, Integer> mySet) {
        this.mySet = mySet;
    }

    int GetAgeB() {
        int b = 0;
        for (int i : mySet.values()) {
            if (i < 1985) {
                b += 1;
            }
        }
        return b;
    }

    int GetAgeA() {
        int a = 0;
        for (int i : mySet.values()) {
            if (i > 1990) {
                a += 1;
            }
        }
        return a;
    }
}

public class task7_30 {
    public static void main(String[] args) {
        HashMap<String, Integer> mySet = new HashMap<>();

        mySet.put("Italia", 1983);
        mySet.put("Lana", 2000);
        mySet.put("Rachel", 1988);

        CountAges ca = new CountAges(mySet);
        CountAges cb = new CountAges(mySet);

        System.out.println("People before 1985 - " + ca.GetAgeB() + " People after 1990 - " + cb.GetAgeA());
    }
}

package trainingTasks;

import java.util.HashMap;

class CountPoints {
    private final HashMap<String, Integer> mySet;

    public CountPoints(HashMap<String, Integer> mySet) {
        this.mySet = mySet;
    }

    int GetFive() {
        int five = 0;
        for (int i : mySet.values()) {
            if (i == 5) {
                five += 1;
            }
        }
        return five;
    }

    int GetTwo() {
        int two = 0;
        for (int i : mySet.values()) {
            if (i == 2) {
                two += 1;
            }
        }
        return two;
    }
}

public class task7_29 {
    public static void main(String[] args) {
        HashMap<String, Integer> mySet = new HashMap<>();

        mySet.put("Rachel", 5);
        mySet.put("Italia", 5);
        mySet.put("Mike", 2);
        mySet.put("Cat", 4);
        mySet.put("Cayla", 2);
        mySet.put("Lana", 5);

        CountPoints cp = new CountPoints(mySet);
        CountPoints ct = new CountPoints(mySet);

        System.out.println("Amount of 5 points - " + cp.GetFive() + " Amount of 2 point - " + ct.GetTwo());
    }
}

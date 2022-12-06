package trainingTasks;

import java.util.HashMap;

class CountFive {
    private final HashMap<String, Integer> myPoints;


    CountFive(HashMap<String, Integer> myPoints) {
        this.myPoints = myPoints;
    }

    int GetPoints() {
        int result = 0;
        for (int i : myPoints.values()) {
            if (i == 5) {
                result += 1;
            }
        }
        return result;
    }
}

public class task7_25 {
    public static void main(String[] args) {
        HashMap<String, Integer> myPoints = new HashMap<>();

        myPoints.put("Mike", 4);
        myPoints.put("Rachel", 5);
        myPoints.put("Italia", 5);
        myPoints.put("Lana", 4);
        myPoints.put("Lani", 5);

        CountFive cf = new CountFive(myPoints);
        System.out.println("Amount of 5 points is - " + cf.GetPoints());
    }
}

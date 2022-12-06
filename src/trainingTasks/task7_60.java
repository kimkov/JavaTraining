package trainingTasks;

import java.util.Comparator;
import java.util.HashMap;

class apartCount {
    private final HashMap<Integer, Integer> apart;

    apartCount(HashMap<Integer, Integer> apart) {
        this.apart = apart;
    }

    int FindApart() {
        return apart.keySet().stream()
                .max(Comparator.comparing(apart::get))
                .orElse(0);
    }
}

public class task7_60 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> apart = new HashMap<>();

        apart.put(1, 3);
        apart.put(2, 2);
        apart.put(3, 5);
        apart.put(4, 3);
        apart.put(5, 1);
        apart.put(6, 5);
        apart.put(7, 7);

        apartCount ap = new apartCount(apart);

        System.out.println("Number of the apartment with more people live inside - " + ap.FindApart());
    }
}

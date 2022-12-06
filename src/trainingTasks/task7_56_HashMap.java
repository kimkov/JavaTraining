package trainingTasks;

import java.util.HashMap;                                   // 220

class FindDist {
    private final HashMap<String, Integer> ds;

    FindDist(HashMap<String, Integer> ds) {
        this.ds = ds;
    }

    String GetCity() {
        String result = null;
        int d = 0;
        for (int i : ds.values()) {
            if (i > d) {
                d = i;
            }
        }
        for (String k : ds.keySet()) {
            if (ds.get(k).equals(d)) {
                result = k;
            }
        }
        return result;
    }
}

public class task7_56_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> ds = new HashMap<>();

        ds.put("st.Peter", 300);
        ds.put("Voronezh", 500);
        ds.put("Omsk", 1200);
        ds.put("Krasnoyarsk", 4000);
        ds.put("sochi", 700);

        FindDist fd = new FindDist(ds);

        System.out.println("Farthest city from Moscow is - " + fd.GetCity());
    }
}

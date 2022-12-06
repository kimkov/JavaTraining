package trainingTasks;

import java.util.Comparator;                                        // 221
import java.util.HashMap;

class CarSpeed {
    private final HashMap<String, Integer> sp;

    CarSpeed(HashMap<String, Integer> sp) {
        this.sp = sp;
    }

    String GetCarSpeed() {
        String maxSpeed = sp.keySet().stream()
                .max(Comparator.comparing(sp::get))
                .orElse(null);
        return maxSpeed;
    }
}

public class task7_57_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> sp = new HashMap<>();

        sp.put("BMW", 300);
        sp.put("Aston", 340);
        sp.put("Mercedes", 280);
        sp.put("Audi", 310);
        sp.put("GMC", 270);

        CarSpeed cs = new CarSpeed(sp);

        System.out.println(cs.GetCarSpeed());
    }
}

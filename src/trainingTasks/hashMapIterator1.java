package trainingTasks;

import java.util.HashMap;

public class hashMapIterator1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(110, "Ravi");
        hm.put(120, "Prateek");
        hm.put(130, "Davesh");
        hm.put(140, "Kamal");
        hm.put(150, "Pawan");

        for (int key : hm.keySet()) {
            System.out.println("Roll no.: " + key + " name: " + hm.get(key));
        }
    }
}

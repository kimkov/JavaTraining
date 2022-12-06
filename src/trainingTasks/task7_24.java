package trainingTasks;

import java.util.HashMap;                                        // 204

class CountSt {
    private final HashMap<String, Integer> myClass;

    public CountSt(HashMap<String, Integer> myClass) {
        this.myClass = myClass;
    }

    void GetMyClass() {
        int result = 0;
        for (String i : myClass.keySet()) {
            if ((i.equals("2A")) || (i.equals("2B")) || (i.equals("2V"))) {
                result += myClass.get(i);
            }
        }
        System.out.println(result);
    }
}

public class task7_24 {
    public static void main(String[] args) {
        HashMap<String, Integer> myClass = new HashMap<>();

        myClass.put("1A", 28);
        myClass.put("1B", 20);
        myClass.put("1V", 29);
        myClass.put("2A", 30);
        myClass.put("2B", 25);
        myClass.put("2V", 24);
        myClass.put("3A", 28);
        myClass.put("3B", 20);
        myClass.put("3V", 29);
        myClass.put("4A", 30);
        myClass.put("4B", 25);
        myClass.put("4V", 24);
        myClass.put("5A", 28);
        myClass.put("5B", 20);
        myClass.put("5V", 29);
        myClass.put("6A", 30);
        myClass.put("6B", 25);
        myClass.put("6V", 24);

        CountSt sn = new CountSt(myClass);

        sn.GetMyClass();
    }
}

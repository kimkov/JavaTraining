package trainingTasks;

import java.util.HashMap;

class CountRain {
    private final HashMap<Integer, Integer> myWeather;
    private int result = 0;

    public CountRain(HashMap<Integer, Integer> myWeather) {
        this.myWeather = myWeather;
    }

    void GetWeather() {
        for (int i : myWeather.keySet()) {
            if (i % 2 == 0) {
                result += myWeather.get(i);
            }
        }
        System.out.println("Amount of rain - " + result);
    }

}

public class task7_23 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> myWeather = new HashMap<>();
        myWeather.put(1, 200);
        myWeather.put(2, 100);
        myWeather.put(3, 78);
        myWeather.put(4, 234);
        myWeather.put(5, 245);
        myWeather.put(6, 137);

        CountRain cr = new CountRain(myWeather);

        cr.GetWeather();
    }
}

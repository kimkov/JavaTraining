package trainingTasks;

class SumDouble {                           // 197
    double GetSumDouble() {
        double count = 0;
        for (double x : new double[]{3.4, 12.2, 9.7, 15.7, 23.6, 5.1}) {
            if (x > 10.75) {
                count += x;
            }
        }
        return count;
    }
}

public class task7_14 {
    public static void main(String[] args) {
        SumDouble sd = new SumDouble();
        System.out.println(sd.GetSumDouble());
    }
}

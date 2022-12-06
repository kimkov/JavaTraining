package trainingTasks;

class CountMin {                        // 168
    int x;
    int i, min, result, p;

    CountMin(int x) {
        this.x = x;
    }

    int GetCountMin () {
        while (x > 0) {
            i++;
            p = x % 10;
            if (p < min) {
                min = x % 10;
                result = 1;
            } else if (p == min) {
                result += 1;
            } else {
                min = p;
            }
            x /= 10;
        }
        return result;
    }
}

public class task6_32 {
    public static void main(String[] args) {
        int x = 20045;
        CountMin lm = new CountMin(x);

        System.out.println(lm.GetCountMin());
    }
}

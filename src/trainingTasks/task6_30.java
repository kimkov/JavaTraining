package trainingTasks;

class Find8 {
    int result;
    int i = 0;
    int x;
    Find8(int x) {
        this.x = x;
    }

    int IndOf8() {
        while (x > 0) {
            i++;
            if (x % 10 == 8) {
                result = i;
                break;
            }
            x /= 10;
        }
        return result;
    }
}

public class task6_30 {
    public static void main(String[] args) {
        int x = 238758382;

        Find8 r = new Find8(x);
        System.out.println(r.IndOf8());
    }
}

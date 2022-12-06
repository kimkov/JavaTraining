package trainingTasks;

class InfoMaxMin {
    int x;
    int max, min;
    int MaxIndStart;
    int MaxIndEnd = -1;
    int MinIndStart;
    int MinIndEnd;
    int i = 0;

    InfoMaxMin(int x) {
        this.x = x;
    }

    void GetMaxInd() {
        while (x > 0) {
            i++;
            if (x % 10 > max) {
                MaxIndEnd = i;
                max = x % 10;
            }
            x /= 10;
        }
        MaxIndStart = (i - MaxIndEnd) + 1;
        System.out.println("Max num is - " + max + " index from end is - " + MaxIndEnd + " Index from start " + MaxIndStart);
    }

    void GetMinInd() {
        while (x > 0) {
            i++;
            if ((x % 10 < min) || (min == 0)) {
                MinIndEnd = i;
                min = x % 10;
            }
            x /= 10;
        }
        MinIndStart = (i - MinIndEnd) + 1;
        System.out.println("Min num is - " + min + " index from end is - " + MinIndEnd + " Index from start " + MinIndStart);
    }
}

public class task6_29 {
    public static void main(String[] args) {
        int x = 134956973;

        InfoMaxMin d = new InfoMaxMin(x);
        InfoMaxMin p = new InfoMaxMin(x);
        d.GetMaxInd();
        p.GetMinInd();
    }
}

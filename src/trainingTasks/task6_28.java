package trainingTasks;

class InfoNum {                             // 164
    int max, min, indMaxStart, indMaxEnd = -1, indMinStart, indMinEnd;
    int x;

    InfoNum(int x) {
        this.x = x;
    }

    void GetMaxEnd(int x) {
        int i = 0;
        while (x > 0) {
            i++;
            if ((x % 10) > max) {
                indMaxEnd = i;
                max = x % 10;
            }
            x /= 10;
        }
        indMaxStart = (i - indMaxEnd) + 1;
        System.out.println("Max num is - " + max + " index from the end - " + indMaxEnd + " index from start is - " + indMaxStart);
    }

    void GetMinEnd(int x) {
        int i = 0;
        while (x > 0) {
            i++;
            if (((x % 10) < min) || min == 0) {
                indMinEnd = i;
                min = x % 10;
            }
            x /= 10;
        }
        indMinStart = (i - indMinEnd) + 1;
        System.out.println("Min num is - " + min + " index from the end is - " + indMinEnd + " index from start is - " + indMinStart);
    }
}

public class task6_28 {
    public static void main(String[] args) {
        int x = 12397423;

        InfoNum mx = new InfoNum(x);
        InfoNum mn = new InfoNum(x);
        mx.GetMaxEnd(x);
        mn.GetMinEnd(x);
    }
}

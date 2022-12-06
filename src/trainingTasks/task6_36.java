package trainingTasks;

class EndSeven {                        // 172
    int x, p, count;

    void GetEndSeven() {
        while (count < 10) {
            p = x % 10;
            if ((p == 7) && (x % 9 == 0 ) && (x > 100)) {
                System.out.print(x + " ");
                x += 1;
                count += 1;
            }
            x += 1;
        }
    }
}

public class task6_36 {
    public static void main(String[] args) {
        EndSeven es = new EndSeven();
        es.GetEndSeven();
    }
}

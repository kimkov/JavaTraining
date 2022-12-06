package trainingTasks;

class DivDouble {
    int count, x;

    void GetDivDouble() {
        do {
            if (((x % 13 == 0) || (x % 17 == 0)) && x > 500) {
                System.out.print(x + " ");
                x += 1;
                count += 1;
            }
            x += 1;
        } while (count < 20);
    }
}

public class task6_35 {
    public static void main(String[] args) {
        DivDouble dm = new DivDouble();
        dm.GetDivDouble();
    }
}

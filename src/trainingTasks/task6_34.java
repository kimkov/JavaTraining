package trainingTasks;

class DivNinth {
    int i = 0;
    int x = 100;
    int count;

    void GetDivNinth() {
        for (i = 0; count < 15; i++) {
            if (x % 19 == 0) {
                System.out.print(x + " ");
                x += 1;
                count += 1;
            }
            x += 1;
        }
    }
}

public class task6_34 {
    public static void main(String[] args) {
        DivNinth dv = new DivNinth();
        dv.GetDivNinth();
    }
}

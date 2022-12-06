package trainingTasks;

class DivHundred {
    int i, x;

    // числа кратные 30 с использованием цикла с условием
    void GetDivH() {
        for (i = 0; i < 100; i++) {
            x += 1;
            if ((x % 30 == 0) && (x < 100)) {
                System.out.print(x + " ");
            }
        }
    }

    // числа кратные 30 без использования цикла с условием
}

public class task6_33 {
    public static void main(String[] args) {
        DivHundred d = new DivHundred();
        d.GetDivH();
    }
}

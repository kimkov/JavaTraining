package trainingTasks;

class CNumV {                               // 184
    void GetCNumV() {
        int x = 41, y = 41;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                x += 1;
                System.out.print(x + " ");
            }
            y += 10;
            x = y;
            System.out.println();
        }
    }
}

public class task8_1_v {
    public static void main(String[] args) {
        CNumV cv = new CNumV();
        cv.GetCNumV();
    }
}

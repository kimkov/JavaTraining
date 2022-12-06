package trainingTasks;

class COfNum {

    void GetNumC() {
        int x = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                x += 1;
                System.out.print(x + " ");
            }
            x = 0;
            System.out.println();
        }
    }
}

public class task8_1_b {
    public static void main(String[] args) {
        COfNum cn = new COfNum();
        cn.GetNumC();
    }
}

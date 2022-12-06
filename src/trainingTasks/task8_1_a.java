package trainingTasks;

class CicleOfNum1 { void GetCicle() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(5 + " ");
            }
            System.out.println();
        }
    }
}

public class task8_1_a {
    public static void main(String[] args) {
        CicleOfNum1 cn = new CicleOfNum1();
        cn.GetCicle();
    }
}

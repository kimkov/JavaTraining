package trainingTasks;

class FourNum {
    void GetAllNum() {

        int x = 1000;
        while (x != 9999) {
            if ((x % 133) == 125) {
                System.out.print(x + " ");
            } else if ((x % 134) == 111) {
                System.out.print(x + " ");
            }
            x += 1;
        }
    }
}

public class task7_6 {
    public static void main(String[] args) {
        FourNum fn = new FourNum();
        fn.GetAllNum();
    }
}

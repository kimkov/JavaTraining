package trainingTasks;

public class task5_70 {

    public static void amebaFunc(int x) {
        int result = 0;
        if (x <= 3) {
            System.out.println("There is no any cells!");
        } else {
            result = (x / 3) * 2;
            System.out.println("There is - " + result + " ready cells");
        }
    }

    public static void main(String[] args) {
        amebaFunc(16);
    }
}

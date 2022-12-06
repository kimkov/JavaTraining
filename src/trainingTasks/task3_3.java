package trainingTasks;

public class task3_3 {
    public static void main(String[] args) {
        boolean a = true, b = true, c = false;

        System.out.println(!(a || b));
        System.out.println(a || !b);
        System.out.println(a && b || c);
    }
}

package trainingTasks;

class Factorial {
    int fact(int n) {
        int result;

        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}

public class recurFunc1 {
    public static void main(String[] args) {
        Factorial fact = new Factorial();

        System.out.println(fact.fact(5));
        System.out.println(fact.fact(10));
        System.out.println(fact.fact(12));
        System.out.println(fact.fact(15));
    }
}

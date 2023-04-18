package trainingTasks;

interface NumericFunc {
	int func(int n);
}

public class ABlockLambdaDemo {
	public static void main(String[] args) {
		NumericFunc factorial = (n) -> {
			int result = 1;
			for(int i = 1; i <= n; i++) {
				result *= i;
			}
			return result;
		};
		System.out.println("factorial 3 - " + factorial.func(3));
		System.out.println("factorial 5 - " + factorial.func(5));
	}
}

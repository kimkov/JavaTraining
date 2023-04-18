package trainingTasks;

interface SomeFunc<T> {
	T func(T t);
}

public class ALambdaGenericsDemo3 {
	public static void main(String[] args) {
		SomeFunc<String> reverse = (str) -> {
			String result = "";
			for(int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result;
		};
		
		System.out.println("String lamda in reverse order: " + reverse.func("lambda"));
		
		SomeFunc<Integer> factorial = (n) -> {
			int result = 1;
			for(int i = 1; i <= n; i++) {
				result *= i;
			}
			return result;
		};
		
		System.out.println("factorial of 5 is: " + factorial.func(5));
	}
}

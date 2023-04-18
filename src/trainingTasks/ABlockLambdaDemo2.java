package trainingTasks;

interface StringFunc {
	String func(String s);
}

public class ABlockLambdaDemo2 {
	public static void main(String[] args) {
		StringFunc reverse = (str) -> {
			String result = "";
			for(int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result;
		};
		System.out.println("reverse of 'lambda' - " + reverse.func("lambda"));
	}
}

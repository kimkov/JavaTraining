package trainingTasks;

public class test4 {
	public static void main(String[] args) {
		int d, a;
		try {
			d = 0;
			a = 42 / d;
			System.out.print("This message do not show");
		} catch (ArithmeticException e) {
			System.out.print("Divided by ZERO is False");
		}
	}
}

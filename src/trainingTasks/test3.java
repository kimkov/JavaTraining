package trainingTasks;

public class test3 {
	public static void main(String[] args) {
		int x = 123;
		int tmp = 0;
		
		while(x > 0) {
			tmp = (tmp * 10) + x % 10;
			x /= 10;
		}

		
		System.out.println(tmp);
		System.out.println(x);
	}
}

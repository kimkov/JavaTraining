package trainingTasks;

class Test {
	void meth(int i, int j) {
		i *= 2;
		j /= 2;
	}
}

public class ACallByValue {
	public static void main(String[] args) {
		Test ob = new Test();
		int a = 15, b = 20;
		
		System.out.println("a and b before func: " + a + " " + b);
		
		ob.meth(a, b);
		
		System.out.println("a and b after func: " + a + " " + b);
	}
}

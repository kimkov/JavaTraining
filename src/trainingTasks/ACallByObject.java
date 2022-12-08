package trainingTasks;

class TestObj {
	int a, b;
	
	TestObj(int i, int j) {
		a = i;
		b = j;
	}
	
	void meth(TestObj o) {
		o.a *= 2;
		o.b /= 2;
	}
}

public class ACallByObject {
	public static void main(String[] args) {
		TestObj ob = new TestObj(15, 20);
		
		System.out.println("A and B before a call: " + ob.a + " " + ob.b);
		
		ob.meth(ob);
		
		System.out.println("A and B after a call: " + ob.a + " " + ob.b);
	}
}

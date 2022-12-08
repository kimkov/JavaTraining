package trainingTasks;

class TestInc {
	int a;
	
	TestInc(int i) {
		a = i;
	}
	
	TestInc IncByTen() {
		TestInc temp = new TestInc(a + 10);
		return temp;
	}
}

public class AIncrByNum {
	public static void main(String[] args) {
		TestInc ts = new TestInc(2);
		TestInc ts1;
		
		ts1 = ts.IncByTen();
		
		System.out.println("A variant 1 - " + ts.a);
		System.out.println("A variant 2 - " + ts1.a);
	}
}

package trainingTasks;

class Gen<T> {
	T ob;
	
	Gen(T o) {
		ob = o;
	}
	
	T getOb() {
		return ob;
	}
	
	void showType() {
		System.out.println("Type of T is: " + ob.getClass().getName());
	}
}

public class AGenericsDemo {
	public static void main(String[] args) {
		Gen<Integer> iOb;
		iOb = new Gen<Integer>(88);
		iOb.showType();
		int v = iOb.getOb();
		System.out.println("Value is: " + v);
		System.out.println();
		
		Gen<String> strOb = new Gen<String>("Test message");
		strOb.showType();
		String str = strOb.getOb();
		System.out.println("value is: " + str);
	}
}

package trainingTasks;

// Динамическая диспетчеризация методов

class ADisp {
	void callme() {
		System.out.println("Method callme from ADisp");
	}
}

class BDisp extends ADisp {
	void callme() {
		System.out.println("Method callme from BDisp");
	}
}

class CDisp extends BDisp {
	void callme() {
		System.out.println("Method callme from CDisp");
	}
}

public class ADynamicDispatch {
	public static void main(String[] args) {
		ADisp a = new ADisp();		// Object class A
		BDisp b = new BDisp();		// Object class B
		CDisp c = new CDisp();		// Object class C
		
		ADisp r;					// Get link on object class A
		
		r = a;						// r refers to object A
		r.callme();					// call variant callme from A
		
		r = b;						// r refers to object B
		r.callme();					// call variant callme from B
		
		r = c;						// r refers to object C
		r.callme(); 				// call variant callme from C
	}
}

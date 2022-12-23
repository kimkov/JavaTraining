package trainingTasks;

abstract class AbsA {
	abstract void callme();
	
	void callmetoo() {
		System.out.println("Абстрактные классы могут содержать конкретные методы.");
	}
}

class AbsB extends AbsA {
	void callme() {
		System.out.println("Реализация метода callme() из класса В.");
	}
}

public class AAbstractDemo {
	public static void main(String[] args) {
		AbsB b = new AbsB();
		
		b.callme();
		b.callmetoo();
	}
}

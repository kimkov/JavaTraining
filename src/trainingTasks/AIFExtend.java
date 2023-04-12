package trainingTasks;

// Один интерфейс может расширять другой
interface ExtA {
	void meth1();
	void meth2();
}

// Теперь интерфейс В включает в себя методы meth1() и meth2() и добавляет meth3()
interface ExtB extends ExtA {
	void meth3();
}

// Этот класс должен реализовать все методы из интерфейса А и В
class MyClass1 implements ExtB {
	public void meth1() {
		System.out.println("Реализация метода meth1()");
	}
	
	public void meth2() {
		System.out.println("Реализация метода meth2()");
	}
	
	public void meth3() {
		System.out.println("Реализация метода meth3()");
	}
}

public class AIFExtend {
	public static void main(String[] args) {
		MyClass1 ob = new MyClass1();
		
		ob.meth1();
		ob.meth2();
		ob.meth3();
	}
}

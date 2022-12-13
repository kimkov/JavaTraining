package trainingTasks;

// Методы с отличающимися сигнатурами считаются перегружаемыми а не переопределяемыми

class AOver {
	int i, j;
	AOver(int a, int b) {
		i = a;
		j = b;
	}
	// вывести содердимое i и j
	void show() {
		System.out.println("i and j - " + i + " " + j);
	}
}

class BOver extends AOver {
	int k;
	BOver(int a, int b, int c) {
		super(a, b);
		k = c;
	}
	// перегрузить метод show
	void show(String msg) {
		System.out.println(msg + k);
	}
}

public class AOverrideEx {
	public static void main(String[] args) {
		BOver subOb = new BOver(23, 9, 67);
		
		subOb.show("Это к - "); // вызвать метод из класса BOver
		subOb.show();			// вызвать метод из класса AOver
	}
}

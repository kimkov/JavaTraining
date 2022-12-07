package trainingTasks;

interface IntStack {				// определить интерфейс для целочисленного стека
	void push (int item);			// сохранить элемент в стеке
	int pop();						// извлечь элемент из стека
}

class FixedStack implements IntStack {		// реализация интерфейса IntStack для стека фиксированного размера
	private int stck[];
	private int tos;
	
	FixedStack(int size) {					// выделить память и инициализировать стек
		stck = new int[size];
		tos -= 1;
	}
	
	public void push(int item) {			// разместить элемент в стеке
		if (tos == stck.length-1)			// использовать поле длины стека
			System.out.println("Stack is full!");
		else
			stck[++tos] = item;
	}
	
	public int pop() {
		if(tos < 0) {
			System.out.println("Stack is empty!");
			return 0;
		}
		else
			return stck[tos--];
	}
}

public class AIFtest {
	public static void main(String[] args) {
		FixedStack mystack1 = new FixedStack(5);
		FixedStack mystack2 = new FixedStack(8);
		
		// разместить числа в стеке
		for(int i = 0; i < 5; i++) mystack1.push(i);
		for(int i = 0; i < 8; i++) mystack2.push(i);
		
		// извлечь числа из стека
		System.out.println("Numbers in mystack1: ");
		for(int i = 0; i < 5; i++) {
			System.out.print(mystack1.pop());
		}
		System.out.println(" ");
		System.out.println("Numbers in mystack2: ");
		for(int i = 0; i < 8; i++) {
			System.out.print(mystack2.pop());
		}
	}
}

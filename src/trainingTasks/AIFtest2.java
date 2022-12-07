package trainingTasks;

// Реализация наращиваемого стека

class DynStack implements IntStack {
	private int stck[];
	private int tos;
	
	// Выделить память и инициализировать стек
	DynStack(int size) {
		stck = new int[size];
		tos -= 1;
	}
	
	// Разместить элемент в стеке
	public void push(int item) {
		// Если стек заполнить выделить память большего размера
		if(tos == stck.length-1) {
			int temp[] = new int[stck.length * 2];		// Удвоить размер стека
			for(int i = 0; i < stck.length; i++) {
				temp[i] = stck[i];
				stck = temp;
				stck[++tos] = item;
			}
		}
		else {
			stck[++tos] = item;
		}
	}
	
	// Извлечь элемент из стека
	public int pop() {
		if(tos < 0) {
			System.out.println("Stack is empty");
			return 0;
		}
		else {
			return stck[tos--];
		}
	}
}

public class AIFtest2 {
	public static void main(String[] args) {
		DynStack mystack1 = new DynStack(5);
		DynStack mystack2 = new DynStack(8);
		
		// В этих числах увеличиваются размеры каждого стека
		for(int i = 0; i < 12; i++) {
			mystack1.push(i);
		}
		
		for(int i = 0; i < 20; i++) {
			mystack2.push(i);
		}
		
		// Извлечь числа из стека
		System.out.println("");
		for(int i = 0; i < 12; i++) {
			System.out.print(mystack1.pop());
		}
		
		System.out.println("");
		for(int i = 0; i < 20; i++) {
			System.out.print(mystack2.pop());
		}
	}
}

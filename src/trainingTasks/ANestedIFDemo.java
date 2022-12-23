package trainingTasks;

// пример вложенного интерфейса

class NestA {				// Этот класс содержит интерфейс как свой член
	//Вложенный интерфейс
	public interface NestedIF {
		boolean isNotNegative(int x);
	}
}

// Класс В реализует вложенный интерфейс
class NestB implements NestA.NestedIF {
	public boolean isNotNegative(int x) {
		return x < 0 ? false : true;
	}
}

public class ANestedIFDemo {
	public static void main(String[] args) {
		// Использовать ссылку на вложенный интерфейс
		NestA.NestedIF nif = new NestB();
		
		if(nif.isNotNegative(10)) {
			System.out.println("Число 10 неотрийательное");
		}
		
		if(nif.isNotNegative(-12)) {
			System.out.println("Число отрицательное");
		}
	}
}

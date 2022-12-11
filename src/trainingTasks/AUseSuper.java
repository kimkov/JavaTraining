package trainingTasks;

// Использовать слово super с целью предотвратить сокрытие имен

class UseSA {
	int i;
}
// Создать подкласс путем расширения класса А
class UseSB extends UseSA {
	int i;		// Этот член i скрывает член i из класса А
	
	UseSB(int a, int b) {
		super.i = a;	// член i из класса А
		i = b;			// член i из класса В
	}
	
	void show() {
		System.out.println("Член i в суперклассе - " + super.i);
		System.out.println("Член i в подклассе - " + i);
	}
}

public class AUseSuper {
	public static void main(String[] args) {
		UseSB subOb = new UseSB(1, 2);
		subOb.show();
	}
}

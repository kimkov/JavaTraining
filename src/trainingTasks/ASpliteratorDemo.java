package trainingTasks;

import java.util.*;

//Простая демонстрация использования Spliterator.

public class ASpliteratorDemo {
	public static void main(String[] args) {
		ArrayList<Double> vals = new ArrayList<>();
		vals.add(1.0);
		vals.add(2.0);
		vals.add(3.0);
		vals.add(4.0);
		vals.add(5.0);
		
		// Использовать tryAdvance() для отображения содержимого vals.
		System.out.println("vals consisted of: ");
		Spliterator<Double> splitr = vals.spliterator();
		while(splitr.tryAdvance((n) -> System.out.println(n)));
		System.out.println();
		
		// Создать новый список, содержащий значения квадратных 
		// корней элементов из vals. 
		
		splitr = vals.spliterator();
		ArrayList<Double> sqrs = new ArrayList<>();
		while(splitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));
		System.out.println("sqrs consist of: ");
		splitr = sqrs.spliterator();
		splitr.forEachRemaining((n) -> System.out.println(n));
		System.out.println();
	}
}

package trainingTasks;

import java.util.*;

public class AIteratorDemo {
	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("C");
		al1.add("A");
		al1.add("E");
		al1.add("B");
		al1.add("D");
		al1.add("F");
		
		//Использовать итератор для отображения содержимого al.
		System.out.print("Initial array: ");
		Iterator<String> itr = al1.iterator();
		while(itr.hasNext()) {
			String elem = itr.next();
			System.out.print(elem + " ");
		}
		System.out.println();
		
		//Модифицировать объекты в ходе итерации.
		ListIterator<String> Litr = al1.listIterator();
		while(Litr.hasNext()) {
			String elem = Litr.next();
			Litr.set(elem);
		}
		
		System.out.print("Modified list: ");
		itr = al1.iterator();
		while(itr.hasNext()) {
			String elem = itr.next();
			System.out.print(elem + " ");
		}
		System.out.println();
		
		System.out.print("Modified list in reverse order: ");
		while(Litr.hasPrevious()) {
			String elem = Litr.previous();
			System.out.print(elem + " ");
		}
		System.out.println();
	}
}

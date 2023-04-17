package trainingTasks;

// пример обобщенного интерфейса


// интерфейс для нахождения наименьшего и наибольшего значения
interface MinMax1<T extends Comparable<T>> {
	T min();
	T max();
}

// реализация интерфейса MinMax
class MinMaxCl<T extends Comparable<T>> implements MinMax1<T> {
	T[] arr;
	MinMaxCl(T[] o) {
		arr = o;
	}
	
	public T min() {
		T v = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].compareTo(v) < 0) {
				v = arr[i];
			}
		}
		return v;
	}
	
	public T max() {
		T v = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].compareTo(v) > 0) {
				v = arr[i];
			}
		}
		return v;
	}
}

public class AGenericInterface {
	public static void main(String[] args) {
		Integer[] inums = {3, 6, 2, 8};
		Character[] chs = {'b', 'r', 'p', 'w'};
		
		MinMaxCl iob = new MinMaxCl<Integer>(inums);
		MinMaxCl sob = new MinMaxCl<Character>(chs);
		
		System.out.println("Max value among numbers is: " + iob.max());
		System.out.println("Min value among numbers is: " + iob.min());
		
		System.out.println("Max value among letters is: " + sob.max());
		System.out.println("Min value among letters is: " + sob.min());
	}
}

package trainingTasks;

interface MinMax<T extends Comparable<T>> {
	T min();
	T max();
}

class Myclass<T extends Comparable<T>> implements MinMax<T> {
	T[] vals;
	
	Myclass(T[] o) {
		vals = o;
	}
	
	public T min() {
		T v = vals[0];
		
		for(int i = 1; i < vals.length; i++) {
			if(vals[i].compareTo(v) < 0) {
				v = vals[i];
			}
		}
		return v;
	}
	
	public T max() {
		T v = vals[0];
		for(int i = 1; i < vals.length; i++) {
			if(vals[i].compareTo(v) > 0) {
				v = vals[i];
			}
		}
		return v;
	}
}

public class AGenericIFMinMax {
	public static void main(String[] args) {
		Integer[] inums = {3,6,2,8,6};
		Character[] chs = {'b', 'r', 'p', 'w'};
		Myclass<Integer> iOb = new Myclass<Integer>(inums);
		Myclass<Character> cOb = new Myclass<Character>(chs);
		
		System.out.println("Max value in inums: " + iOb.max());
		System.out.println("Min value in inums: " + iOb.min());
		System.out.println();
		System.out.println("Max value in chs: " + cOb.max());
		System.out.println("Min value in chs: " + cOb.min());
	}
}

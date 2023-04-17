package trainingTasks;

public class AGenericMethDemo {
	
	// Выяснить, присутствует ли объект в массиве .
	static <T extends Comparable<T>, V extends T> boolean IsIn(T x, V[] y) {
		for( int i = 0; i < y.length; i++) {
			if(x.equals(y[i])) return true;
		}
		return false;
	}
	// --- end ----
	
	public static void main(String[] args) {
		
		// Исполь зовать isin() для объектов Integer. 
		Integer[] nums = {1, 2, 3, 4, 5};
		if(IsIn(2, nums)) {
			System.out.println("2 in nums");
		}
		if(!IsIn(7, nums)) {
			System.out.println("7 is not in nums");
		}
		System.out.println();
		
		// Исполь зовать isin() для объектов String.
		String[] strs = {"one", "two", "three", "four", "five"};
		if(IsIn("two", strs)) {
			System.out.println("two is in strs");
		}
		if(!IsIn("seven", strs)) {
			System.out.println("seneve is not in strs");
		}
	}
}

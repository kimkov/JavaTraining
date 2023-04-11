package trainingTasks;

class Stats<T extends Number> {
	T[] nums;
	Stats(T[] o) {
		nums = o;
	}
	
	double average() {
		double sum = 0.0;
		
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i].doubleValue();
		}
		return sum / nums.length;
	}
}

public class AGenericsDemo2 {
	public static void main(String[] args) {
		Integer[] inums = {1,2,3,4,5};
		Stats<Integer> iOb = new Stats<Integer>(inums);
		
		double v = iOb.average();
		System.out.println("Average sum iob is: " + v);
		
		Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
		Stats<Double> dOb = new Stats<Double>(dnums);
		double w = dOb.average();
		System.out.println("Average sum of dOd is: " + w);
	}
}

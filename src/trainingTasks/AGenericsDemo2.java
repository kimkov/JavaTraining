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
	
	boolean isSameAvg(Stats<?> ob) {
		if(average() == ob.average()) {
			return true;
		}
		return false;
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
		
		Float[] fnums = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
		Stats<Float> fob = new Stats<Float>(fnums);
		double x = fob.average();
		System.out.println("Average sum of fob is: " + x);
		System.out.println();
		
		// find which array has the same value;
		System.out.println("average sum of iOb and Dob ");
		if(iOb.isSameAvg(dOb)) {
			System.out.println("Same!");
		} else {
			System.out.println("Different");
		}
		System.out.println();
		System.out.println("Average sum of iOb and fob ");
		if(iOb.isSameAvg(fob)) {
			System.out.println("Same!");
		} else {
			System.out.println("Diff");
		}
	}
}

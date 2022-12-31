package trainingTasks;

import java.lang.Math;

class S11_2_a {
	
	void Sol1() {
		double[] nums = new double[15];
		
		for(int i = 0; i < nums.length; i++) {
			double n = Math.random();
			
			nums[i] = n;
		}
		
		for(int j = 0; j < nums.length; j++) {
			System.out.println(nums[j]);
		}
		
		System.out.println("END");
	}
	
	void Sol2() {
		
	}
}

public class task11_3 {
	public static void main(String[] args) {

		S11_2_a sa = new S11_2_a();
		
		sa.Sol1();
	}
}

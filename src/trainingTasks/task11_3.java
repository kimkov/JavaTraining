package trainingTasks;

import java.lang.Math;
import java.text.DecimalFormat;

class S11_2_a {
	
	double[] nums = new double[15];
	
	S11_2_a(double[] nums) {
		this.nums = nums;
	}
	
	void Sol1() {
		DecimalFormat df = new DecimalFormat("###.##");
		
		for(int i = 0; i < nums.length; i++) {
			double n = Math.random();
			
			nums[i] = n;
		}
		
		for(int j = 0; j < nums.length; j++) {
			System.out.println(df.format(nums[j]));
		}
		
		System.out.println("END");
		System.out.println(" ");
	}
	
	void Sol2() {
		DecimalFormat df = new DecimalFormat("###.###");
		
		for(int i = 0; i < nums.length; i++) {
			double m = 22 + Math.random() * 1;
			
			nums[i] = m;
		}
		
		for(int j = 0; j < nums.length; j++) {
			System.out.println(df.format(nums[j]));
		}
		
		System.out.println(" ");
	}
	
	void Sol3() {
		DecimalFormat df = new DecimalFormat("###.###");
		
		for(int i = 0; i < nums.length; i++) {
			double n = Math.random() * 10;
			
			nums[i] = n;
		}
		
		for(int j = 0; j < nums.length; j++) {
			System.out.println(df.format(nums[j]));
		}
		System.out.println(" ");
	}
	
	void Sol4() {
		for(int i = 0; i < nums.length; i++) {
			int x = (int)(Math.random() * 10);
			
			nums[i] = x;
		}
		
		for(int j = 0; j < nums.length; j++) {
			System.out.println(nums[j]);
		}
		
		System.out.println(" ");
	}
}

public class task11_3 {
	public static void main(String[] args) {

		double[] nums = new double[15];
		S11_2_a sa = new S11_2_a(nums);
		
		sa.Sol1();
		
		sa.Sol2();
		
		sa.Sol3();
		
		sa.Sol4();
	}
}

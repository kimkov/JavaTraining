package trainingTasks;

import java.lang.Math;

class S11_10 {
	private int[] nums;
	private int x;
	
	S11_10(int[] nums, int x) {
		this.nums = nums;
		this.x = x;
	}
	
	void Sol11_10() {
		int y = 0;

		for(int i = 0; i < nums.length; i++) {
			y = x % 10;
			nums[i] = y;
			x /= 10;
		}
		
		for(int j = 0; j < nums.length; j++) {
			System.out.print(nums[j] + " ");
		}
	}
}

public class task11_10 {
	public static void main(String[] args) {
		int[] nums = new int[10];
		
		int x = (int) (Math.random() * 999999);
		
		System.out.println(x);
		
		S11_10 sl = new S11_10(nums, x);
		
		sl.Sol11_10();
	}
}

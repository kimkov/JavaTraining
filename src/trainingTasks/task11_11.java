package trainingTasks;

import java.lang.Math;

class S11_11 {
	private int[] nums;
	
	S11_11(int[] nums) {
		this.nums = nums;
	}
	
	void Sol11_11() {
		int i, j;
		
		for(i = 0; i < nums.length;) {
			int x = (int) (Math.random() * 30);
			
			for(j = 0; j < i; j++) {
				if(nums[j] == x) {
					break;
				}
			}
			if(j == i) {
				nums[j] = x;
				System.out.print(nums[j] + " ");
				i++;
			}
		}
	}
}

public class task11_11 {
	public static void main(String[] args) {
		int[] nums = new int[20];
		
		S11_11 sl = new S11_11(nums);
		
		sl.Sol11_11();
	}
}

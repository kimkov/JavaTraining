package trainingTasks;

import java.lang.Math;

class S11_12 {
	private int[] nums;
	
	S11_12(int[] nums) {
		this.nums = nums;
	}
	
	void Sol11_12() {
		int i,j = 0;
		for(i = 0; i < nums.length;) {
			int x = (int) (300 + Math.random() * 999);
			
			for(j = 0; j < i; j++) {
				if((x % 13 != 0) && (x % 17 != 0)) {
					break;
				}
			}
			if((x % 13 == 0) || (x % 17 == 0)) {
				nums[j] = x;
				System.out.print(nums[j] + " ");
				i++;
			}
		}
	}
}

public class task11_12 {
	public static void main(String[] args) {
		int[] nums = new int[20];
		
		S11_12 sl = new S11_12(nums);
		sl.Sol11_12();
	}
}

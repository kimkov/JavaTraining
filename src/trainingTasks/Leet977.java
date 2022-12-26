package trainingTasks;

import java.util.Arrays;

class S977 {
	int[] nums;
	
	S977(int[] nums) {
		this.nums = nums;
	}
	
	int[] sortedSquares() {
		for(int i : nums) {
			nums[i] *= nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}
}

public class Leet977 {
	public static void main(String[] args) {
		int[] nums = new int[] {-4, -1, 0, 3, 10};
		
		S977 sl = new S977(nums);
		
		System.out.println(sl.sortedSquares());
	}
}

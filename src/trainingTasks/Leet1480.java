package trainingTasks;

class Solution {
	int[] nums;
	
	Solution(int[] nums) {
		this.nums = nums;
	}
	
	
	public int[] runningSum(int[] nums) {
		
		for(int i = 1; i < nums.length; i++) {
			nums[i] += nums[i - 1];
		}
		return nums;
	}
}

public class Leet1480 {
	public static void main(String[] args) {
	
		int[] nums = {1, 2, 3, 4};
		Solution sl = new Solution(nums);
		
		System.out.println(sl.runningSum(nums));
	}
}

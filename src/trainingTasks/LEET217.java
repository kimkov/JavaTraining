package trainingTasks;

import java.util.Arrays;

class S217 {
	private int[] nums;
	
	S217(int[] nums) {
		this.nums = nums;
	}
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] == nums[j]) {
					return true;
				}
			}
		}
		return false;
	}
}

public class LEET217 {
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4};
		
		S217 sl = new S217(nums);
		
		System.out.print(sl.containsDuplicate(nums));
	}
}

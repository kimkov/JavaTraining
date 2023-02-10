package trainingTasks;

import java.util.Arrays;

class S1051b {
	private int[] nums;
	
	S1051b(int[] nums) {
		this.nums = nums;
	}
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public int heightChecker1(int[] nums) {
		if(nums.length < 2) {
			return 0;
		}
		
		int[] arr = new int[nums.length];
		
		for(int i = 0; i < nums.length; i++) {
			arr[i] = nums[i];
		}
		
		Arrays.sort(arr);
		
		int result = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != arr[i]) {
				result++;
			}
		}
		return result;
	}
}

public class LEET1051b {
	public static void main(String[] args) {
		int[] nums = new int[] {5,1,6,3,4,2};
		
		S1051b sl = new S1051b(nums);
		
		System.out.print(sl.heightChecker1(nums));
	}
}

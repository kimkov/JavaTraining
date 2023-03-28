package trainingTasks;

class TwiceLargeNumber {
	private int[] nums;
	
	TwiceLargeNumber(int[] nums) {
		this.nums = nums;
	}
	
	public int FindLargeNum(int[] nums) {
		int max = 0, maxIndex = 0;
		for(int i = 0; i < nums.length; ++i) {
			if(nums[i] > max) {
				max = nums[i];
				maxIndex = i;
			}
		}
		for(int x : nums) {
			if(x != max && max < x * 2) {
				return -1;
			}
		}
		return maxIndex;
	}
	
}

public class TwiceLargestNum {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		TwiceLargeNumber ts = new TwiceLargeNumber(nums);
		System.out.println(ts.FindLargeNum(nums));
	}
}

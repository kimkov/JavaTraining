package trainingTasks;

import java.util.Arrays;

class S136 {
	private int[] nums;
	
	S136(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public int SolSingleN(int[] nums) {
		int result = 0;
		
		if(nums.length < 2) {
//			return
		}
		
		Arrays.sort(nums);
		
		return result;
	}
}

public class LEET136 {
	public static void main(String[] args) {
		int[] nums = new int[] {1};
		
		S136 sl = new S136(nums);
		System.out.print(sl.SolSingleN(nums));
	}
}

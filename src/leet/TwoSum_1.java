package leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class S1 {
	private int[] nums;
	private int target;
	
	S1(int[] nums, int target) {
		this.nums = nums;
		this.target = target;
	}
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public void setTarget(int target) {
		this.target = target;
	}
	
	public int getTarget() {
		return target;
	}
	
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> comp = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			int tmp = target - nums[i];
			if(comp.containsKey(tmp)) {
				return new int[] {comp.get(tmp), i};
			}
			comp.put(nums[i], i);
		}
		return null;
	}
}

public class TwoSum_1 {
	public static void main(String[] args) {
		int[] nums = new int[] {3,2,4};
		int target = 6;
		
		S1 sl = new S1(nums, target);

		System.out.println(Arrays.toString(sl.twoSum(nums, target)));
	}
}

package leet;

import java.util.HashSet;
import java.util.Set;

class ContDup {
	private int[] nums;
	private int k;
	
	ContDup(int[] nums, int k) {
		this.nums = nums;
		this.k = k;
	}
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public void setK(int k) {
		this.k = k;
	}
	
	public int getK() {
		return k;
	}
	
	public boolean containsDuplicate(int[] nums, int k) {
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < nums.length; ++i) {
			if(set.contains(nums[i])) {
				return true;
			}
			set.add(i);
			if(set.size() > k) {
				set.remove(nums[i - k]);
			}
		}
		return false;
	}
}

public class ContainsDuplicate2 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,1,2,3};
		int k = 2;
		
		ContDup sl = new ContDup(nums, k);
		System.out.println(sl.containsDuplicate(nums, k));
	}
}

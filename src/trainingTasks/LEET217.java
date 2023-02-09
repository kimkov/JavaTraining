package trainingTasks;

import java.util.HashSet;
import java.util.Set;

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
		Set<Integer> arr = new HashSet<>(nums.length);
		for(int x : nums) {
			if(arr.contains(x)) {
				return true;
			}
			arr.add(x);
		}
		return false;
	}
}

public class LEET217 {
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,1};
		
		S217 sl = new S217(nums);
		
		System.out.print(sl.containsDuplicate(nums));
	}
}

package trainingTasks;

class S35 {
	private int[] nums;
	private int target;
	
	S35(int[] nums, int target) {
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
	
	public int searchInsert(int[] nums, int target) {
		int ind = 0;
		if(nums.length < 1) {
			return 0;
		}
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == target) {
				ind = i;
			} else if(nums[i] < target) {
				ind = i + 1;
			}
		}
		return ind;
	}
}

public class LEET35 {
	public static void main(String[] args) {
		int[] nums = new int[] {1,3,5,6};
		int target = 7;
		
		S35 sl = new S35(nums, target);
		
		System.out.print(sl.searchInsert(nums, target));
	}
}

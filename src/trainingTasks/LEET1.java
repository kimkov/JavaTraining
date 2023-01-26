package trainingTasks;

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
	
	public int[] Sol11(int[] nums, int target) {
		int[] result = new int[2];
		
		for(int i = 0; i < nums.length - 1; ++i) {
			for(int j = i + 1; j < nums.length - 1; ++j) {
				if(nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
					break;
				}
			}
		}
		return result;
	}
}

public class LEET1 {
	public static void main(String[] args) {
		int[] nums = new int[] {2, 7, 11, 15};
		int target = 9;
		
		S1 sl = new S1(nums, target);
		
		for(int x : sl.Sol11(nums, target)) {
			System.out.print(x + " ");
		};
		
	}
}

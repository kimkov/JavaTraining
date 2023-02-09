package trainingTasks;

class S66 {
	private int[] nums;
	
	S66(int[] nums) {
		this.nums = nums;
	}
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public int[] plusOne(int[] nums) {
		for(int i = nums.length - 1; i >= 0; i--) {
			if(nums[i] < 9) {
				nums[i]++;
				return nums;
			} 
			nums[i] = 0;
		}
		nums = new int[nums.length - 1];
		nums[0] = 1;
		return nums;
	}
}

public class LEET66 {
	public static void main(String[] args) {
		int[] nums = new int[] {9};
		
		S66 sl = new S66(nums);
		for(int i = 0; i < nums.length; i++) {
			System.out.println(sl.plusOne(nums));
		}
	}
}

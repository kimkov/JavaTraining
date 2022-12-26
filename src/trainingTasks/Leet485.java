package trainingTasks;

class S485 {
	int[] nums;
	
	S485(int[] nums) {
		this.nums = nums;
	}
	
	int Solution() {
		int count = 0;
		int result = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) {
				count++;
				result = Math.max(result, count);
			} else {
				count = 0;
			}
		}
		
		return result;
	}
}

public class Leet485 {
	public static void main(String[] args) {
		int[] nums = new int[] {1, 1, 0, 1, 1, 1};
		
		S485 sl = new S485(nums);
		
		System.out.println(sl.Solution());
	}
}

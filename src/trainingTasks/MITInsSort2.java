package trainingTasks;

class SMITInsSort2 {
	private int[] nums;
	
	SMITInsSort2(int[] nums) {
		this.nums = nums;
	}
	
	void SolMITInsSort2() {
		for(int i = 1; i < nums.length; i++) {
			int cur = nums[i];
			int j = i - 1;
			
			while(j >= 0 && nums[j] > cur) {
				nums[j + 1] = nums[j];
				j -= 1;
			}
			nums[j + 1] = cur;
		}
		for(int n = 0; n < nums.length; n++) {
			System.out.print(nums[n] + " ");
		}
	}
}

public class MITInsSort2 {
	public static void main(String[] args) {
		int[] nums = new int[] {1, 41, 59, 26, 17, 58};
		
		SMITInsSort2 sl = new SMITInsSort2(nums);
		sl.SolMITInsSort2();
	}
}

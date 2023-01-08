package trainingTasks;

class SMITInsSort1 {
	private int[] nums;
	
	SMITInsSort1(int[] nums) {
		this.nums = nums;
	}
	
	void SolInsSort() {
		for(int i = 1; i < nums.length; i++) {
			int cur = nums[i];
			int j = i - 1;
			
			while(j >= 0 && nums[j] < cur) {
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

public class MITInsSort1 {
	public static void main(String[] args) {
		int[] nums = new int[] {31, 41, 59, 26, 41, 58};
		
		SMITInsSort1 sl = new SMITInsSort1(nums);
		sl.SolInsSort();
	}
}

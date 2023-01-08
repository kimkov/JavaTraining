package trainingTasks;

class SInsSort {
	private int[] nums;
	
	SInsSort(int[] nums) {
		this.nums = nums;
	}
	
	void SolInsSort() {
		for(int i = 1; i < nums.length; i++) {
			int cur = nums[i];
			int j = i - 1;
			
			while(j >= 0 && nums[j] > cur) {
				nums[j + 1] = nums[j];
				j -= 1;
			}
			nums[j + 1] = cur;
		}
		for(int a = 0; a < nums.length; a++) {
			System.out.print(nums[a] + " ");
		}
	}
}

public class MITInsSort {
	public static void main(String[] args) {
		int[] nums = new int[] {31, 41, 59, 26, 41, 58};
		
		SInsSort sl = new SInsSort(nums);
		sl.SolInsSort();
	}
}

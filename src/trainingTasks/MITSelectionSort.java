package trainingTasks;

class SMITSelectionSort {
	private int[] nums;
	
	SMITSelectionSort(int[] nums) {
		this.nums = nums;
	}
	
	void SolMITSelectionSort() {
		for(int i = 0; i < nums.length - 1; i++) {
			int ind = i;
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[j] < nums[ind]) {
					ind = j;
				}
			}
			int smallerNumber = nums[ind];
			nums[ind] = nums[i];
			nums[i] = smallerNumber;
		}
		for(int n = 0; n < nums.length; n++) {
			System.out.print(nums[n] + " ");
		}
	}
}

public class MITSelectionSort {
	public static void main(String[] args) {
		int[] nums = new int[] {1, 41, 59, 26, 41, 58};
		
		SMITSelectionSort sl = new SMITSelectionSort(nums);
		sl.SolMITSelectionSort();
	}
}

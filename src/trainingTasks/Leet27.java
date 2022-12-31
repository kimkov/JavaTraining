package trainingTasks;

class S27 {
	int[] nums;
	int val;
	
	S27(int[] nums, int val) {
		this.nums = nums;
		this.val = val;
	}
	
	public int removeElement(int[] nums, int val) {
		int i = 0;
		for(int j = 0; j < nums.length; j++) {
			if(nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}
}

public class Leet27 {
	public static void main(String[] args) {
		int[] nums = new int[] {3, 2, 2, 3};
		int val = 3;
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println(" ");
		
		
	}
}

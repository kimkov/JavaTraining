package trainingTasks;

class S75 {
	private int[] nums;
	
	S75(int[] nums) {
		this.nums = nums;
	}
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public void sortColors(int[] nums) {
		int min_index;
		for(int i = 0; i < nums.length; i++) {
			min_index = i;
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[j] < nums[min_index]) {
					min_index = j;
				}
			}
			int tmp = nums[min_index];
			nums[min_index] = nums[i];
			nums[i] = tmp;
		}
		
		for(int b = 0; b < nums.length; b++) {
			System.out.print(nums[b] + " ");
		}
	}
}

public class LEET75 {
	public static void main(String[] args) {
		int[] nums = new int[] {2,0,2,1,1,0};
		
		S75 sl = new S75(nums);
		
		sl.sortColors(nums);
	}
}

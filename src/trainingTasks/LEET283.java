package trainingTasks;

class S283 {
	private int[] nums;
	
	S283(int[] nums) {
		this.nums = nums;
	}
	
	void moveZeroes() {
		int i, index = 0;
		
		for(i = 0; i < nums.length; i++) {
			if(nums[i] != 0) {
				nums[index++] = nums[i];
			}
		}
		
		for(i = index; i < nums.length; i++) {
			nums[i] = 0;
		}

		for(int n = 0; n < nums.length; n++) {
			System.out.print(nums[n] + " ");
		}
	}
}

public class LEET283 {
	public static void main(String[] args) {
		int[] nums = new int[] {0,1,0,3,12};
		
		S283 sl = new S283(nums);
		
		sl.moveZeroes();
	}
}

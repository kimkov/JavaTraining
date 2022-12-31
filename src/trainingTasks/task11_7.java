package trainingTasks;

class S11_7 {
	int[] nums;
	
	S11_7(int[] nums) {
		this.nums = nums;
	}
	
	void Sol11_7() {
		int x = 20;
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = x;
			--x;
		}
		
		for(int j = 0; j < nums.length; j++) {
			System.out.print(nums[j] + " ");
		}
	}
}

public class task11_7 {
	public static void main(String[] args) {
		int[] nums = new int[20];
		
		S11_7 sl = new S11_7(nums);
		sl.Sol11_7();
	}
}

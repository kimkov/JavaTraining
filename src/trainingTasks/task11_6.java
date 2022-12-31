package trainingTasks;

class S11_6 {
	private int[] nums;
	
	S11_6(int[] nums) {
		this.nums = nums;
	}
	
	void Sol11_6() {
		int x = 1;
		for(int i = 0; i < nums.length; i++) {
			nums[i] = x;
			x++;
		}
		for(int j = 0; j < nums.length; j++) {
			System.out.print(nums[j] + " ");
		}
	}
}

public class task11_6 {
	public static void main(String[] args) {
		int[] nums = new int[12];
		
		S11_6 sl = new S11_6(nums);
		
		sl.Sol11_6();
	}
}

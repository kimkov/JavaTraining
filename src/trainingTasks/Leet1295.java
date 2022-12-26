package trainingTasks;

class S1295 {
	int[] nums;
	
	S1295(int[] nums) {
		this.nums = nums;
	}
	
	int Solution1() {
		int count = 0;
		int result = 0;
//		int num = 0;
//		int i;
		
		for(int i = 0; i < nums.length; i++) {
//			num = nums[i];
			
			while(nums[i] > 0) {
				nums[i] /= 10;
				count++;
			}
			if(count % 2 == 0) {
				result++;
			} else {
				count = 0;
			}
		}
		return result;
	}
}

public class Leet1295 {
	public static void main(String[] args) {
		int[] nums = new int[] {3, 12, 345, 2, 6, 1771};
		
		S1295 sl = new S1295(nums);
		System.out.println(sl.Solution1());
	}
}

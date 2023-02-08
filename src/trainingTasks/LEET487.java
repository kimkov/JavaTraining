package trainingTasks;

class S487 {
	private int[] nums;
	
	S487(int[] nums) {
		this.nums = nums;
	}
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public int findMaxConsecutiveOnes(int[] nums) {
		int result = 0, left = 0, right = 0, zero = 0;
		
		//while our windows is in bounds
		while(right < nums.length) {
			
			// add the right most element into our window
			if(nums[right] == 0) {
				zero++;
			}
			
			// if our window is invalid, contract our window
			while(zero == 2) {
				if(nums[left] == 0) {
					zero--;
				}
				left++;
			}
			// update our longest sequence answer
			result = Math.max(result, right - left + 1);
			
			// expand our window
			right++;
		}
		return result;
	}
}

public class LEET487 {
	public static void main(String[] args) {
		int[] nums = new int[] {1, 0, 1, 0, 0, 1};
		
		S487 sl = new S487(nums);
		
		System.out.println(sl.findMaxConsecutiveOnes(nums));
	}
}

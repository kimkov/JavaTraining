package trainingTasks;

class S136 {
	private int[] nums;
	
	S136(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public int SolSingleN(int[] nums) {
		int result = 1;
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length; j++) {
				if(nums[i] != nums[j]) {
					result = nums[i];
					j++;
				}
			}
			if(result >= 2) {
				i++;
				result = nums[i];
			}
			i++;
		}
		return result;
	}
}

public class LEET136 {
	public static void main(String[] args) {
		int[] nums = new int[] {2,2,1};
		
		S136 sl = new S136(nums);
		System.out.print(sl.SolSingleN(nums));
	}
}

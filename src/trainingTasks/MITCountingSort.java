package trainingTasks;

class Scount {
	private int[] nums;
	private int nSize;
	
	Scount(int[] nums, int nSize) {
		this.nums = nums;
		this.nSize = nSize;
	}
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public void setNSize(int nSize) {
		this.nSize = nSize;
	}
	
	public int getNSize() {
		return nSize;
	}
	
	public void Scount(int[] nums, int nSize) {
		int[] output = new int[nSize + 1];
		
		int max = nums[0];
		for(int i = 0; i < nSize; i++) {
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		
		int[] count = new int[max + 1];
		for(int i = 0; i < max; i++) {
			count[i] = 0;
		}
		
		for(int i = 0; i < nSize; i++) {
			count[nums[i]]++;
		}
		
		for(int i = 1; i <= max; i++) {
			count[i] += count[i - 1];
		}
		
		
	}
}

public class MITCountingSort {
	public static void main(String[] args) {
		int[] nums = new int[] {22,5,3,10,4,1,7,12};
		int nSize = nums.length;
	}
}

package JavaLangTR;

class ScountingSort {
	private int[] nums;
	private int nSize;
	
	ScountingSort(int[] nums, int nSize) {
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
	
	public static void Scount(int[] nums, int nSize) {
		int[] output = new int[nSize + 1];
		
		// find largest element of the array
		int max = nums[0];
		for(int i = 0; i < nSize; i++) {
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		int[] count = new int[max + 1];
		
		// initialize count array with all zeros
		for(int i = 0; i < max; i++) {
			count[i] = 0;
		}
		
		// store the count of each element
		for(int i = 0; i < nSize; i++) {
			count[nums[i]]++;
		}
		
		// store the cummulative count of each array
		for(int i = 1; i <= max; i++) {
			count[i] += count[i - 1];
		}
		
		// find the index of each element of the original array in count array, and 
		// place the elements in output array
		for(int i = nSize - 1; i >= 0; i--) {
			output[count[nums[i]] - 1] = nums[i];
			count[nums[i]]--;
		}
		
		// copy the stored elements into original array
		for(int i = 0; i < nSize; i++) {
			nums[i] = output[i];
		}
	}
}

public class countingSortEx {
	public static void main(String[] args) {
		int[] nums = new int[] {22,5,3,10,4,1,7,12};
		int nSize = nums.length;
		
		ScountingSort.Scount(nums, nSize);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}

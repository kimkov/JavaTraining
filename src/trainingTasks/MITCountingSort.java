package trainingTasks;

import java.util.Arrays;

public class MITCountingSort {
	
	void countSort(int[] nums, int nSize) {
		int[] output = new int[nSize + 1];
		
		// Find the largest element of the array
		int max = nums[0];
		for(int i = 0; i < nSize; i++) {
			if(nums[i] > max) {
				max = nums[i];
			}
		}

		int[] count = new int[max + 1];
		// Initialize count array with all zeros.
		for(int i = 0; i < max; ++i) {
			count[i] = 0;
		}
		
		// Store the count of each element
		for(int i = 0; i < nSize; i++) {
			count[nums[i]]++;
		}
		
		// Store the cummulative count of each array
		for(int i = 1; i <= max; i++) {
			count[i] += count[i - 1];
		}
		
		// Find the index of each element of the original array in count array, and
	    // place the elements in output array
		for(int i = nSize - 1; i >= 0; i--) {
			output[count[nums[i]] - 1] = nums[i];
			count[nums[i]]--;
		}
		
		// Copy the sorted elements into original array
		for(int i = 0; i < nSize; i++) {
			nums[i] = output[i];
		}
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {22,5,3,10,4,1,7,12};
		int nSize = nums.length; 
		
		MITCountingSort sl = new MITCountingSort();
		sl.countSort(nums, nSize);
		
		System.out.print(Arrays.toString(nums));
		
	}
}

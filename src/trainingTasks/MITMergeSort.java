package trainingTasks;

class SMITMergeSort {
	private int[] nums;
	
	SMITMergeSort(int[] nums) {
		this.nums = nums;
	}
	
	void MergeSort(int[] nums) {
		int inputLength = nums.length;
		
		if(inputLength < 2) {
			return;
		}
		
		int midIndex = inputLength / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength - midIndex];
		
		for(int i = 0; i < midIndex; i++) {
			leftHalf[i] = nums[i];
		}
		
		for(int i = midIndex; i < inputLength; i++) {
			rightHalf[i - midIndex] = nums[i];
		}
		
		MergeSort(leftHalf);
		MergeSort(rightHalf);
		
		merge(nums, leftHalf, rightHalf);
	}
	
	void merge(int[] nums, int[] leftHalf, int[] rightHalf) {
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;
		
		int i = 0, j = 0, k = 0;
		
		while(i < leftSize && j < rightSize) {
			if(leftHalf[i] <= rightHalf[j]) {
				nums[k] = leftHalf[i];
				i++;
			} else {
				nums[k] = rightHalf[j];
				j++;
			}
			k++;
		}
		
		while(i < leftSize) {
			nums[k] = leftHalf[i];
			i++;
			k++;
		}
		
		while(j < rightSize) {
			nums[k] = rightHalf[j];
			j++;
			k++;
		}
	}
}

public class MITMergeSort {
	public static void main(String[] args) {
		
		int[] nums = new int[] {3, 41, 52, 26, 38, 57, 9, 49};
		
		SMITMergeSort sl = new SMITMergeSort(nums);
		
		sl.MergeSort(nums);
		
		for(int n = 0; n < nums.length; n++) {
			System.out.print(nums[n] + " ");
		}
	}
}

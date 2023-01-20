package trainingTasks;

class sMergeSort {
	
	sMergeSort(int[] nums) {
	}
	
	public int[] getNums(int[] nums) {
		return nums;
	}
	
	public void setNums(int[] nums) {
	}
	
	void sMerge(int[] nums) {
		int inputLength = nums.length;
		
		if(inputLength < 2) {
			return;
		}
		
		int midIndex = nums.length / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength - midIndex];
		
		for(int i = 0; i < midIndex; i++) {
			leftHalf[i] = nums[i];
		}
		
		for(int i = midIndex; i < inputLength; i++) {
			rightHalf[i - midIndex] = nums[i];
		}
		
		sMerge(leftHalf);
		sMerge(rightHalf);
		
		sHeapSort(nums, leftHalf, rightHalf);
	}
	
	void sHeapSort(int[] nums, int[] leftHalf, int[] rightHalf) {
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

public class MITMergeSort1 {
	public static void main(String[] args) {
		
		int[] nums = new int[] {3, 41, 52, 17, 26, 38, 57, 9, 49};
		
		sMergeSort sl = new sMergeSort(nums);
		
		sl.sMerge(nums);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
	}
}

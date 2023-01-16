package trainingTasks;

class MMergeSort {
	private int[] nums;
	
	MMergeSort(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public static void sMerge(int[] nums) {
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
		
		sMergeSort(nums, leftHalf, rightHalf);
	}
	
	public static void sMergeSort(int[] nums, int[] leftHalf, int[] rightHalf) {
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
		
		MMergeSort sl = new MMergeSort(nums);
		
		MMergeSort.sMerge(nums);
		
		for(int n = 0; n < nums.length; n++) {
			System.out.print(nums[n] + " ");
		}
	}
}

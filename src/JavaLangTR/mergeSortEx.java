package JavaLangTR;

class Smergesort {
	private int[] nums;
	
	Smergesort(int[] nums) {
		this.nums = nums;
	}
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public static void sMerge(int[] nums) {
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
		
		for(int i = midIndex; i < nums.length; i++) {
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
			if(leftHalf[i] < rightHalf[j]) {
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

public class mergeSortEx {
	public static void main(String[] args) {
		int[] nums = new int[] {17,18,5,4,6,1};
		
		Smergesort.sMerge(nums);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}

package leet;

class s912 {
	private int[] nums;
	
	s912(int[] nums) {
		this.nums = nums;
	}
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public static void Sol912Merge(int[] nums) {
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
		
		Sol912Merge(leftHalf);
		Sol912Merge(rightHalf);
		
		
		sMerge912(nums, leftHalf, rightHalf);
		
	}
	
	public static void sMerge912(int[] nums, int[] leftHalf, int[] rightHalf) {
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

public class SortAnArray_912 {
	public static void main(String[] args) {
		int[] nums = new int[] {5,2,3,1};
		
		s912.Sol912Merge(nums);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}

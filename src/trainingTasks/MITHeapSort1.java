package trainingTasks;

class MITHeapSort2 {
	private int[] nums;
	
	MITHeapSort2(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public void heapSort(int[] nums) {
		
		int heapSize = nums.length;
		for(int i = heapSize / 2 - 1; i >= 0; i--) {
			heapify(nums, heapSize, i);
		}
		
		for(int i = heapSize - 1; i >= 0; i--) {
			int swap = nums[0];
			nums[0] = nums[i];
			nums[i] = swap;
		
			heapify(nums, i, 0);
		}
	}
	
	public void heapify(int[] nums, int heapSize, int i) {
		int max = i;
		int leftChild = 2 * i + 1;
		int rightChild = 2 * i + 2;
		
		if(leftChild < heapSize && nums[leftChild] > nums[max]) {
			max = leftChild;
		}
		if(rightChild < heapSize && nums[rightChild] > nums[max]) {
			max = rightChild;
		}
		
		if(max != i) {
			int swap = nums[i];
			nums[i] = nums[max];
			nums[max] = swap;
		
		heapify(nums, heapSize, max);
		}
	}
}

public class MITHeapSort1 {
	public static void main(String[] args) {
		int[] nums = new int[] {3, 41, 52, 17, 26, 38, 57, 9, 49};
		
		MITHeapSort2 sl = new MITHeapSort2(nums);
		
		sl.heapSort(nums);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}


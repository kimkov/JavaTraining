package trainingTasks;

class HeapBuild {
	private int[] nums;
	
	HeapBuild(int[] nums) {
		this.nums = nums;
	}
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public void heap(int[] nums) {
		//building a heap
		int n = nums.length;
		for(int i = n / 2 - 1; i >= 0; i--) {
//			heapify(nums, n, i);
		}
	}
}

public class MITBuildHeap {
	public static void main(String[] args) {
		int[] nums = new int[] {11, 34, 9, 5, 16, 10};
	}
}

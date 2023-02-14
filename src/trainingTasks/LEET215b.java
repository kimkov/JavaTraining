package trainingTasks;

import java.util.Random;

class S215b {
	private int[] nums;
	private int k;
	
	S215b(int[] nums, int k) {
		this.nums = nums;
		this.k = k;
	}
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public void setK(int k) {
		this.k = k;
	}
	
	public int getK() {
		return k;
	}
	
	public void swap(int a, int b) {
		int tmp = this.nums[a];
		this.nums[a] = this.nums[b];
		this.nums[b] = tmp;
	}
	
	public int partition(int left, int right, int pivot_index) {
		int pivot = this.nums[pivot_index];
		// 1. move pivot to the end
		swap(pivot_index, right);
		int store_index = left;
		
		// 2. move all smaller elements to the left
		for(int i = left; i <= right; i++) {
			if(this.nums[i] < pivot) {
				swap(store_index, i);
				store_index++;
			}
		}
		
		// 3. move pivot to its final place
		swap(store_index, right);
		return store_index;
	}
	
	public int quickSelect(int left, int right, int k_smallest) {
		// return the k-th smallest element of list within left..right
		
		if(left == right) {		// if the list contains only one element
			return this.nums[left];		// return that element
		}
		
		// select a random pivot_index
		Random random_num = new Random();
		int pivot_index = left + random_num.nextInt(right - left);
		pivot_index = partition(left, right, pivot_index);
		
		// the pivot is on (N - k)th smallest position
		if(k_smallest == pivot_index) {
			return this.nums[k_smallest];
		} else if(k_smallest < pivot_index) {			// go left side
			return quickSelect(left, pivot_index - 1, k_smallest);
		} 
		return quickSelect(pivot_index + 1, right, k_smallest);
	}
	
	public int findKthLargest(int[] nums, int k) {
		this.nums = nums;
		int size = nums.length;
		// K-th largest is (N - k)th smallest
		return quickSelect(0, size - 1, size - k);
	}
	
}

public class LEET215b {
	public static void main(String[] args) {
		int[] nums = new int[] {3,2,3,1,2,4,5,5,6};
		int k = 4;
		
		S215b sl = new S215b(nums, k);
		
		System.out.println(sl.findKthLargest(nums, k));
	}
}

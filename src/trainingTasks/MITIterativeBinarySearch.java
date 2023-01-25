package trainingTasks;

class SIterBinary {
	private int[] nums;
	private int target;
	
	SIterBinary(int[] nums, int target) {
		this.nums = nums;
		this.target = target;
	}
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public void setTarget(int target) {
		this.target = target;
	}
	
	public int getTarget() {
		return target;
	}
	
    // Function to determine if a `target` exists in the sorted array `nums`
    // or not using a binary search algorithm
	
	int binarySearch(int[] nums, int target) {
		// search space is nums[left...right]
		int left = 0, right = nums.length - 1;
		
		//loop till the search space is exhausted
		while(left <= right) {
            
			// find the mid-value in the search space and
            // compares it with the target
			int mid = (left + right) / 2;
			
            // overflow can happen. Use:
            // int mid = left + (right - left) / 2;
            // int mid = right - (right - left) / 2;
			
	        // target is found
			if(target == nums[mid]) {
				return mid;
			}
			
            // discard all elements in the right search space,
            // including the middle element
			else if(target < nums[mid]) {
				right = mid - 1;
			} 
			
            // discard all elements in the left search space,
            // including the middle element
			else {
				left = mid + 1;
			}
		}
		return -1;
	}
}

public class MITIterativeBinarySearch {
	public static void main(String[] args) {
		int[] nums = new int[] {2, 5, 6, 8, 9, 10};
		int target = 7;
		
		SIterBinary sl = new SIterBinary(nums, target);
		
		int index = sl.binarySearch(nums, target);
		
		if(index != -1) {
			System.out.print("Element found at index " + index);
		} else {
			System.out.print("Element not found");
		}
	}
}

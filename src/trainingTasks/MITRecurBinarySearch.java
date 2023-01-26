package trainingTasks;

class SRecurBinarySearch {
	private int[] nums;
	private int target;
	private int left;
	private int right;
	
	SRecurBinarySearch(int[] nums, int left, int right, int target) {
		this.nums = nums;
		this.left = left;
		this.right = right;
		this.target = target;
	}
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public void setLeft(int left) {
		this.left = left;
	}
	
	public int getLeft() {
		return left;
	}
	
	public void setRight(int right) {
		this.right = right;
	}
	
	public int getRight() {
		return right;
	}
	
	public void setTarget(int target) {
		this.target = target;
	}
	
	public int getTarget() {
		return target;
	}
	
    // Recursive implementation of the binary search algorithm to return
    // the position of `target` in subarray nums[left…right]
	public static int RecurBinaryS(int[] nums, int left, int right, int target) {
        // Base condition (search space is exhausted)
		if(left > right) {
			return -1;
		}
		
        // find the mid-value in the search space and
        // compares it with the target
		int mid = (left + right) / 2;
		
        // overflow can happen. Use below
        // int mid = left + (right - left) / 2;
 
        // Base condition (a target is found)
		if(target == nums[mid]) {
			return mid;
		}
		
        // discard all elements in the right search space,
        // including the middle element
		else if(target < nums[mid]) {
			return RecurBinaryS(nums, left, mid - 1, target);
		}
		
        // discard all elements in the left search space,
        // including the middle element
		else {
			return RecurBinaryS(nums, mid + 1, right, target);
		}
	}
}

public class MITRecurBinarySearch {
	public static void main(String[] args) {
		int[] nums = new int[] {2, 5, 6, 8, 9, 10};
		int target = 5;
		
		int left = 0;
		int right = nums.length - 1;
		
		int index = SRecurBinarySearch.RecurBinaryS(nums, left, right, target);
		
		if(index != -1) {
			System.out.print("Element found at index " + index);
		} else {
			System.out.print("Element not found");
		}
	}
}

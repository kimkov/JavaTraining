package trainingTasks;

class S704 {
	private int[] nums;
	private int target;
	
	S704(int[] nums, int target) {
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
	
	public int search(int[] nums, int target) {
		int lo = 0;
		int hi = nums.length - 1;
		
		while(lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			
			if(nums[mid] == target) {
				return mid;
			} else if(nums[mid] < target) {
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return -1;
	}
}

public class LEET704 {
	public static void main(String[] args) {
		int[] nums = new int[] {-1,0,3,5,9,12};
		int target = 9;
		
		S704 sl = new S704(nums, target);
		
		System.out.print(sl.search(nums, target));
	}
}

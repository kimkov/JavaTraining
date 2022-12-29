package trainingTasks;

//class S27 {
//	int[] nums;
//	int val;
//	
//	S27(int[] nums, int val) {
//		this.nums = nums;
//		this.val = val;
//	}
//	
//	public void removeElement(int[] nums, int val) {
//		int count = nums.length;
//		for(int i = 0; i < nums.length; i++) {
//			if(nums[i] == val) {
//				nums[i - 1] = nums[i];
//				count--;
//			} else {
//				continue;
//			}
//			System.out.println(nums[i]);
//		}
//	}
//}

public class Leet27 {
	public static void main(String[] args) {
		int[] nums = new int[] {3, 2, 2, 3};
		int val = 3;
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println(" ");
		
		for(int a = 0; a < nums.length; a++) {
			if(nums[a] == val) {
				nums[a - 1] = nums[a];
			} else {
				continue;
			}
			for(int j = 0; j < nums.length; j++) {
				System.out.print(nums[a]);
			}
		}
	}
}

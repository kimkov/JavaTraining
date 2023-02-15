package JavaLangTR;

import java.util.Arrays;

public class t1 {
	public static void main(String[] args) {
		int[] nums = new int[] {1,3,4,6,7};
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		System.out.println(" ");
		
		int[] nums2 = Arrays.copyOfRange(nums, 0, 3);
		for(int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + " ");
		}
	}
}

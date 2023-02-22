package trainingTasks;

import java.util.Arrays;
import java.util.HashSet;

class S349 {
	private int[] nums1;
	private int[] nums2;
	
	S349(int[] nums1, int[] nums2) {
		this.nums1 = nums1;
		this.nums2 = nums2;
	}
	
	public void setNums1(int[] nums1) {
		this.nums1 = nums1;
	}
	
	public int[] getNums1() {
		return nums1;
	}
	
	public void setNums2(int[] nums2) {
		this.nums2 = nums2;
	}
	
	public int[] getNums2() {
		return nums2;
	}
	
	public int[] intersevtion(int[] nums1, int[] nums2) {
		HashSet<Integer> map1 = new HashSet<>();
		HashSet<Integer> map2 = new HashSet<>();
		
		for(int i: nums1) {
			map1.add(i);
		}
		
		for(int i: nums2) {
			map2.add(i);
		}
		
		map1.retainAll(map2);
		
		int[] output = new int[map1.size()];
		int ind = 0;
		
		for(int j: map1) {
			output[ind++] = j;
		}
		return output;
	}
}

public class LEET349 {
	public static void main(String[] args) {
		int[] nums1 = new int[] {4,9,5};
		int[] nums2 = new int[] {9,4,9,8,4};
		
		S349 sl = new S349(nums1, nums2);
		System.out.println(Arrays.toString(sl.intersevtion(nums1, nums2)));
	}
}

package leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

class SIntersect {
	private int[] nums1;
	private int[] nums2;
	
	SIntersect(int[] nums1, int[] nums2) {
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
	
	public int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		if(nums1.length > nums2.length) {
			return intersect(nums2, nums1);
		}
		
		for(int i : nums1) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		
		int ind = 0;
		for(int i : nums2) {
			int count = map.getOrDefault(i, 0);
			if(count > 0) {
				nums1[ind++] = i;
				map.put(i, count - 1);
			}
		}
		return Arrays.copyOfRange(nums1, 0, ind);
	}
}

public class IntersectionOfTwoArr {
	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1,3};
		int[] nums2 = {2,3,2};
		
		SIntersect sl = new SIntersect(nums1, nums2);
		System.out.println(Arrays.toString(sl.intersect(nums1, nums2)));
	}
}

package javaLangTR;

import java.util.HashMap;

public class TrHashMap {
	public static void main(String[] args) {
		int[] nums1 = {1,2,4,1,2,3};
		int[] nums2 = {2,3,4,2};
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i : nums1) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		
		int n = 0;
		for(int i : nums2) {
			int count = map.getOrDefault(map, 0);
			if(count > 0) {
				nums1[n++] = i;
				map.put(i, count - 1);
			}
		}
		for(int i : nums1) {
			System.out.println(i);
		}
	}
}

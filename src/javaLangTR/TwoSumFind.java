package javaLangTR;

import java.util.HashMap;
import java.util.Map;

public class TwoSumFind {
	
	public static int[] twosum(int[] nums, int target) {
		Map<Integer, Integer> myMap = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			int num = nums[i];
			int comp = target - num;
			
			if(myMap.containsKey(comp)) {
				return new int[] {myMap.get(comp), i};
			} else {
				myMap.put(num, i);
			}
		}
		return new int[] {};
	}
	
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		
		
		int[] result = twosum(nums, target);
		System.out.println(result);
	}
}

package javaLangTR;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicates {
	
	public static List<Integer> findDuplicates(int[] nums) {
		Map<Integer, Integer> myMap = new HashMap<>();
		List<Integer> result = new ArrayList<>();
		for(int i : nums) {
			myMap.put(i, myMap.getOrDefault(i, 0) + 1);
		}
		for(Map.Entry<Integer, Integer> j : myMap.entrySet()) {
			if(j.getValue() > 1) {
				result.add(j.getKey());
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		
		List<Integer> r = findDuplicates(nums);
		System.out.println(r);
	}
}

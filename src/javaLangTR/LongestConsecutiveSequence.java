package javaLangTR;

import java.util.Set;
import java.util.HashSet;

public class LongestConsecutiveSequence {
	
	public static int longestConsSeq(int[] nums) {
		Set<Integer> mySet = new HashSet<>();
		
		for(int i : nums) {
			mySet.add(i);
		}
		
		int longCount = 0;
		
		for(int i : mySet) {
			if(mySet.contains(i - 1)) {
				int currNum = i;
				int currCount = 1;
				
				while(mySet.contains(currNum + 1)) {
					currNum++;
					currCount++;
				}
				
				longCount = Math.max(longCount, currCount);
			}
		}
		return longCount;
	}
	
	public static void main(String[] args) {
		int[] nums = {100, 4, 200, 1, 3, 2};
		
		int longest = longestConsSeq(nums);
		System.out.println(longest);
	}
}

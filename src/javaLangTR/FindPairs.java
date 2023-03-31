package javaLangTR;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

class fPairs {
	private int[] arr1;
	private int[] arr2;
	private int target;
	
	fPairs(int[] arr1, int[] arr2, int target) {
		this.arr1 = arr1;
		this.arr2 = arr2;
		this.target = target;
	}
	
	public List<int[]> pairFind(int[] arr1, int[] arr2, int target) {
		Set<Integer> mySet = new HashSet<>();
		List<int[]> pairs = new ArrayList<>();
		
		for(int i : arr1) {
			mySet.add(i);
		}
		
		for(int j : arr2) {
			int tmp = target - j;
			if(mySet.contains(tmp)) {
				pairs.add(new int[] {tmp, j});
			}
		}
		return pairs;
	}
}

public class FindPairs {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {2,4,6,8,10};
		int target = 7;
	}
}

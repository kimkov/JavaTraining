package javaLangTR;

import java.util.HashMap;

/*Write a function itemInCommon(array1, array2) that takes two arrays as input and returns true 
 * if there is at least one common item between the two lists, false otherwise.
 * Use a HashMap to solve the problem that creates an O(n) time complexity.*/


public class ItemInCommon {
	
	public boolean findItem(int[] arr1, int[] arr2) {
		HashMap<Integer, Boolean> myMap = new HashMap<>();
		
		for(int i : arr1) {
			myMap.put(i, true);
		}
		
		for(int j : arr2) {
			if(myMap.get(j) != null) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] agrs) {
		int[] arr1 = {1,3,5};
		int[] arr2 = {2,4,8};
		
		ItemInCommon it = new ItemInCommon();
		
		System.out.println(it.findItem(arr1, arr2));
	}
}

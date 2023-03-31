package javaLangTR;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class RemoveDuplicates {
	
	public static List<Integer> removeDup(List<Integer> myList) {
		Set<Integer> mySet = new HashSet<>(myList);
		return new ArrayList<>(mySet);
	}
	
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,1,2,5,6,7,3,4,8,9,5);
		
		System.out.println(removeDup(myList));
	}
}

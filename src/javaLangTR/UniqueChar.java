package javaLangTR;

import java.util.Set;
import java.util.HashSet;

public class UniqueChar {
	
	public static boolean hasUniqueChars(String string) {
		Set<Character> mySet = new HashSet<>();
		
		for(char c : string.toCharArray()) {
			if(mySet.contains(c)) {
				return false;
			}
			mySet.add(c);
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(hasUniqueChars("abcdef"));
	}
}

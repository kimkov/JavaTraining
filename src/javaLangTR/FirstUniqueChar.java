package javaLangTR;

import java.util.Map;
import java.util.HashMap;

public class FirstUniqueChar {
	
	public static Character firstNonRepeatingChar(String s) {
		Map<Character, Integer> myMap = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			myMap.put(c, myMap.getOrDefault(c, 0) + 1);
		}
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(myMap.get(c) == 1) {
				return c;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		String s = "leetcode";
		String s1 = "hheello";
		String s2 = "aabbcc";
		
		System.out.println(firstNonRepeatingChar(s));
		System.out.println(firstNonRepeatingChar(s1));
		System.out.println(firstNonRepeatingChar(s2));
	}
}

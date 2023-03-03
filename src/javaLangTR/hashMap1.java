package javaLangTR;

import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class hashMap1 {
	public static void main(String[] agrs) {
		int result = 0;
		String s = "loveleetcode";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(i, 0) + 1);
			}
		
		for(int i = 0; i < s.length(); i++) {
			if(map.get(s.charAt(i)) == 1) {
				result = s.charAt(i);
			} else {
				result = -1;
			}
		}
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(result);
	}
}

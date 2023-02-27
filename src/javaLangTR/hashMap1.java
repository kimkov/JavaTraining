package javaLangTR;

import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class hashMap1 {
	public static void main(String[] agrs) {
		String s = "loveleetcode";
		
		Map<Character, Integer> map = new HashMap<>();
		
		char[] ch = s.toCharArray();
		
		for(int i = 0; i < ch.length; i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), i);
			}
		}
		
		System.out.println(map.keySet());
		System.out.println(map.containsValue(ch));
	}
}

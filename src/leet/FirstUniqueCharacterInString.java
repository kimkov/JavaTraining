package leet;

import java.util.HashMap;
import java.util.Map;

class FirstUniqueChar {
	private String s;
	
	FirstUniqueChar(String s) {
		this.s = s;
	}
	
	public void setS(String s) {
		this.s = s;
	}
	
	public String getS() {
		return s;
	}
	
	public int FirstUnCh(String s) {
		if(s.length() < 2) {
			return s.indexOf(s);
		}
		
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), i);
			}
			return i;
		}
		
		return -1;
	}
}

public class FirstUniqueCharacterInString {
	public static void main(String[] args) {
		String s = "loveleetcode";
		
		FirstUniqueChar sl = new FirstUniqueChar(s);
		System.out.println(sl.FirstUnCh(s));
	}
}

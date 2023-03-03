package leet;

import java.util.HashMap;

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
	
	public int findFirstUnq(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		for(int i = 0; i < s.length(); i++) {
			if(map.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}
}

public class FirstUniqueCharacterInString {
	public static void main(String[] args) {
		String s = "loveleetcode";
		
		FirstUniqueChar sl = new FirstUniqueChar(s);
		System.out.println("First unique character has index - " + sl.findFirstUnq(s));
	}
}

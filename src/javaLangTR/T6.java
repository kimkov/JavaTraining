package javaLangTR;

import java.util.HashMap;

class S6 {
	private String s;
	
	S6(String s) {
		this.s = s;
	}
	
	public void setS(String s) {
		this.s = s;
	}
	
	public String getS() {
		return s;
	}
	
	public int firstUniqChar(String s) {
		HashMap<Character, Integer> result = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			result.put(c, result.getOrDefault(c, 0) + 1);
		}
		
		for(int i = 0; i < s.length(); i++) {
			if(result.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
		}
	}

public class T6 {
	public static void main(String[] args) {
	String s = "loveleetcode";
	
	S6 sl = new S6(s);
	System.out.println(sl.firstUniqChar(s));
	}
}

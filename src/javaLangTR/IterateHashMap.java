package javaLangTR;

import java.util.Map;
import java.util.HashMap;

public class IterateHashMap {
	public static void main(String[] agrs) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(234, "Italia Richie");
		map.put(345, "Katarina abella");
		map.put(111, "Lani Brasil");
		map.put(777, "Lana Blakley");
		
		for(Map.Entry<Integer, String> item : map.entrySet()) {
			System.out.println("key: " + item.getKey() + " value: " + item.getValue());
		}
	
		System.out.println(" ");
		
		System.out.println(map);
		
		System.out.println(map.containsValue("Katarina abella"));
	}
}

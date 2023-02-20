package javaLangTR;

import java.util.HashMap;

public class t2 {
	public static void main(String[] args) {
		HashMap<Integer, String> countries = new HashMap<>();
		
		countries.put(1,  "USA");
		countries.put(2, "Spain");
		countries.put(3, "Italy");
		countries.put(4, "France");
		
		System.out.println("Printing HashMap");
		System.out.println(countries);
		
		String a = countries.getOrDefault(2, "");
		String b = countries.getOrDefault(4, "");
		
		System.out.println("key - 2 " + a);
		System.out.println("key - 4 " + b);
	}
}

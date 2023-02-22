package javaLangTR;

import java.util.ArrayList;

public class HashMapTr {
	public static void main(String[] args) {
		ArrayList<String> bags = new ArrayList<>();
		
		bags.add("pen");
		bags.add("pencil");
		bags.add("paper");
		
		ArrayList<String> boxes = new ArrayList<>();
		
		boxes.add("pen");
		boxes.add("paper");
		boxes.add("books");
		boxes.add("rubber");
		
		System.out.println("Bags contains: " + bags);
		System.out.println("Boxes contains: " + boxes);
		
		boxes.retainAll(bags);
		
		System.out.println("After applying retainAll()");
		System.out.println("Bags contains: " + bags);
		System.out.println("Boxes contains: " + boxes);
	}
}

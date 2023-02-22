package javaLangTR;

import java.util.HashSet;
import java.util.Set;

public class HashSetTR {
	public static void main(String[] args) {
		// 1. initialize the has set
		Set<Integer> myHashSet = new HashSet<>();
		
		// 2. add a new key
		myHashSet.add(3);
		myHashSet.add(2);
		myHashSet.add(1);
		
		// 3. remove the key
		myHashSet.remove(2);
		
		// 4. check if the key in the hash set
		if(!myHashSet.contains(2)) {
			System.out.println("Key 2 is not in the Hash Set");
		}
		
		// 5. get the size of the hash set
		System.out.println("The size of the hashSet is: " + myHashSet.size());
		
		// 6. iterate the hash set
		for(int i: myHashSet) {
			System.out.print(i + " ");
		}
		
		System.out.println("Are in the hashSet");
		
		// 7. Clear the hashSet
		myHashSet.clear();
		
		// 8. Check if the hashSet is empty
		if(myHashSet.isEmpty()) {
			System.out.println("HashSet is Empty");
		}
	}
}

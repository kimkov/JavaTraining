package javaLangTR;

import java.util.HashMap;
import java.util.Map;

public class HashMapTr {
	public static void main(String[] args) {
		// 1. initialize a hash map
		Map<Integer, Integer> map = new HashMap<>();
		
		// 2. insert a new (key, value) pair
		map.putIfAbsent(0, 0);
		map.putIfAbsent(2, 3);
		
		// 3. insert a new (key, value) pair or update the value of existed key
		map.put(1, 1);
		map.put(1, 2);
		
		// 4. get the value of cpecific key
		System.out.println("The value of key 1 is: " + map.get(1));
		
		// 5. delete a key
		map.remove(2);
		
		// 6. check if a key is in the hash map
		if(!map.containsKey(2)) {
			System.out.println("Key 2 is not in hashMap");
		}
		
		// 7. get the size of the hashMap
		System.out.println("The size of the hashMap: " + map.size());
		
		// 8. iterate the hashMap
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("(" + entry.getKey() + ", " + entry.getValue() + ")");
		}
		System.out.println("are in the hashMap");
		
		// 9. clear the hashMap
		map.clear();
		
		// 10. check if the hash map is empty
		if(map.isEmpty()) {
			System.out.println("Hash map is empty now");
		}
	}
}

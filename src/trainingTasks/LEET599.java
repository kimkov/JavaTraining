package trainingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class S599 {
	private String[] list1;
	private String[] list2;
	
	S599(String[] list1, String[] list2) {
		this.list1 = list1;
		this.list2 = list2;
	}
	
	public void setList1(String[] list1) {
		this.list1 = list1;
	}
	
	public String[] getList1() {
		return list1;
	}
	
	public void setList2(String[] list2) {
		this.list2 = list2;
	}
	
	public String[] getList2() {
		return list2;
	}
	
	public String[] findRestaurant(String[] list1, String[] list2) {
		HashMap<Integer, List<String>> map = new HashMap<>();
		
		for(int i = 0; i < list1.length; i++) {
			for(int j = 0; j < list2.length; j++) {
				if(list1[i].equals(list2[j])) {
					if(!map.containsKey(i + j)) {
						map.put(i + j, new ArrayList<String>());
					}
					map.get(i + j).add(list1[i]);
				}
			}
		}
		int min_sum_idx = Integer.MAX_VALUE;
		for(int i : map.keySet()) {
			min_sum_idx = Math.min(min_sum_idx, i);
		}
		String[] result = new String[map.get(min_sum_idx).size()];
		return map.get(min_sum_idx).toArray(result);
	}
}

public class LEET599 {
	public static void main(String[] args) {
		String[] list1 = {"shogun", "Tapioca Express", "Burger King", "KFC"};
		String[] list2 = {"KFC", "shogun", "Burger King"};
		
		S599 sl = new S599(list1, list2);
		System.out.println(Arrays.toString(sl.findRestaurant(list1, list2)));
	}
}

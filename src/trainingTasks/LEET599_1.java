package trainingTasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class S599_1 {
	private String[] list1;
	private String[] list2;
	
	S599_1(String[] list1, String[] list2) {
		this.list1 = list1;
		this.list1 = list2;
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
	
	public String[] list2() {
		return list2;
	}
	
	public String[] MinSumInd(String[] list1, String[] list2) {
		if(list1.length > list2.length) {
			return MinSumInd(list2, list1);
		}
		
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < list1.length; i++) {
			map.putIfAbsent(list1[i], i);
		}
		
		Set<String> set = new HashSet<>();
		
		int sum = Integer.MAX_VALUE;
		
		for(int i = 0; i < list2.length && i <= sum; i++) {
			if(map.containsKey(list2[i])) {
				int currSum = map.get(list2[i]) + i;
				if(sum == currSum) {
					set.add(list2[i]);
				} else if(sum > currSum) {
					set.clear();
					set.add(list2[i]);
					sum = currSum;
				}
			}
		}
		
		String[] result = new String[set.size()];
		int ind = 0;
		for(String s : set) {
			result[ind++] = s;
		}
		return result;
	}
}

public class LEET599_1 {
	public static void main(String[] agrs) {
		String[] list1 = {"shogun", "Tapioca Express", "Burger King", "KFC"};
		String[] list2 = {"KFC", "shogun", "Burger King"};
		
		S599_1 sl = new S599_1(list1, list2);
		System.out.println(Arrays.toString(sl.MinSumInd(list1, list2)));
	}
}

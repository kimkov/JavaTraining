package trainingTasks;

import java.util.Iterator;

class S21 {
	
	LinkedList<Integer> list1;
	LinkedList<Integer> list2;
	
	S21(LinkedList<Integer>list1, LinkedList<Integer> list2) {
		this.list1 = list1;
		this.list2 = list2;
	}
	
//	LinkedList<Integer> Sol21() {
//		for(Iterator i = l.i)
//	}
	
}

public class LEET21 {
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		
		S21 sl = new S21(list1, list2);
		
		list1.add(1);
		list1.add(2);
		list1.add(4);
		
		list2.add(1);
		list2.add(3);
		list2.add(4);
		
	}
}

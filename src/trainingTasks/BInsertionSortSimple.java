package trainingTasks;

import java.util.Arrays;

class SolInsertionSort {
	String[] myText;
	
	SolInsertionSort(String[] myText) {
		this.myText = myText;
	}
	
	void SolIns() {
		// Sort String with built in function "SORT"
		
		Arrays.sort(myText);
		
		System.out.print(Arrays.toString(myText));
		System.out.println(" ");
	}
	
	void SolIns1() {
		// Sort String without built in function
		String temp;
		
		for(int i = 0; i < myText.length; i++) {
			for(int j = i + 1; j < myText.length; j++) {
				if(myText[i].compareTo(myText[j]) > 0) {
					temp = myText[i];
					myText[j] = myText[i];
					myText[i] = temp;
				}
			}
		}
		
		System.out.print(Arrays.toString(myText));
	}
}

public class BInsertionSortSimple {
	public static void main(String[] args) {
		String[] myText = new String[] {"I", "N", "S", "E", "R", "T", "I", "O", "N", "S", "O", "R", "T"};
		
		SolInsertionSort sl = new SolInsertionSort(myText);
		
		sl.SolIns();
		
		sl.SolIns1();
	}
}

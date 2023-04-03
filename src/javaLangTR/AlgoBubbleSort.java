package javaLangTR;

import java.util.Arrays;

public class AlgoBubbleSort {
	
	public static void bubbleSort(int[] arr) {
		for(int i = arr.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2,4,6,1,3,5};
		
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}

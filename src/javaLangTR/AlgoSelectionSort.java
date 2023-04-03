package javaLangTR;

import java.util.Arrays;

public class AlgoSelectionSort {
	
	public static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			if(i != minIndex) {
				int tmp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = tmp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2,4,6,1,3,5};
		
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}

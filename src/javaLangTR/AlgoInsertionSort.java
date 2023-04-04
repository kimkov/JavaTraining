package javaLangTR;

import java.util.Arrays;

public class AlgoInsertionSort {
	
	public static void insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int tmp = arr[i];
			int j = i - 1;
			while(j > -1 && tmp < arr[j]) {
				arr[j + 1] = arr[j];
				arr[j] = tmp;
				j--;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2,4,6,1,3,5};
		
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}

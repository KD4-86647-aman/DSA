package com.Q1;

import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {
		int arr[] = {10,30,50,40,20};
		System.out.println("Before Sort : "+Arrays.toString(arr));
		insert(arr);
		System.out.println("Before Sort : "+Arrays.toString(arr));
	}
	
	public static void insert(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int temp = arr[i];
			int j;
			for(j = i-1;j>=0 && arr[j]<temp;j--) {
				arr[j+1]=arr[j];
			}
			arr[j+1] = temp;
		}
		
	}

}

package com.ques4;

public class Main {
	
	public int factFind(int num) {
		int pro = 1;
		for(int i=1; i<=num; i++) {
			pro*= i;
		}
		return pro;
	}
	public int[] findFactOfArr(int[] arr) {
		if(arr.length>=3) {
			System.out.println("Error");
		}else if(arr.length==2){
			int diff = arr[0]-arr[1];
			if(diff<1) {
				diff = diff*(-1);
			}
			System.out.println(factFind(diff));
		}else {
			System.out.println(factFind(arr[0]));
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		
		Main m1 = new Main();
		int[] arr1 = {5};
		int[] arr2 = {5,3};
		int[] arr3 = {5,3,4,5};
		m1.findFactOfArr(arr1);
		m1.findFactOfArr(arr2);
		m1.findFactOfArr(arr3);
		
	}
}

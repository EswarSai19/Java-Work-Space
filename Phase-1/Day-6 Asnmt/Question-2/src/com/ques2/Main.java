package com.ques2;

public class Main {
	static int[][] arr = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	}; 
	
	static void evenColumnSum( int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=0; j<arr[i].length; j++) {
				if(arr[j][i] %2==0) {
					sum += arr[j][i];
				}
			}
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		evenColumnSum(arr);
	}
	
	
	
}

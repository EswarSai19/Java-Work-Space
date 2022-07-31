package ques3;



public class Main {
	
	public int[] findAndReturnPrimeNumbers(int[] inputArray){

		int[] resultArray = new int[inputArray.length];
		int ind=0;
		for(int i=0; i<inputArray.length; i++) {
			if(isPrime(inputArray[i])) {
				resultArray[ind++] = inputArray[i];  
			}
		}
		return resultArray;
	}
	public boolean isPrime(int num) {
		int count = 0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count<=2 ? true : false;
	}
	public static void main(String[] args) {
		Main m1 = new Main();
		int[] arr = {2,3,4,5,6,7,8,9,13,15,17,19};
		int[] primeArr = m1.findAndReturnPrimeNumbers(arr);
		if(primeArr.length>0) {
			for(int el : primeArr) {
				if(el!=0)
				System.out.println(el);
			}
		}else {
			System.out.println("Prime number not found in the supplied Array");
		}
		
		
	}
}

package com.mvn.interview.prepartion.coding.prg;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n = 10;
		
		int firstNum = 0;
		
		int secondNum = 1;
		
		int nextNum;
		
		for(int i = 1; i<=n ; i++) {
			
			System.out.print(firstNum +", ");
			
			nextNum = firstNum + secondNum ;
			firstNum = secondNum;
			secondNum = nextNum;
			
		}
		
		
	}

}

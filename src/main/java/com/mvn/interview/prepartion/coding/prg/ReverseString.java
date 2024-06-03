package com.mvn.interview.prepartion.coding.prg;

public class ReverseString {

	public static void main(String[] args) {

		String a = "Nithi";
		char ch ;
		String rev = "";
		
		int length = a.length();
		
		for(int i = 0; i<length; i++) {
			
			ch = a.charAt(i);
			//System.out.println("Char :" +ch);
			rev = ch + rev;
		}
		System.out.println("Reversed String :" + rev);
	}

}

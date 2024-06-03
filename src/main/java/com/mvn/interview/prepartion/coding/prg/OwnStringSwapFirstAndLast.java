package com.mvn.interview.prepartion.coding.prg;

public class OwnStringSwapFirstAndLast {

	public static void main(String[] args) {

		String[] strings = {"Hello","Nithi","Anandh","Java","BackEnd"};
		
		for(int i = 0 ; i < strings.length; i++) {
		  String str = strings[i];
		//  System.out.println("String Length :" + str.length());
		  if(str != null && str.length()>1) {
			  
			  char firstChar = str.charAt(0);
			  char lastChar = str.charAt(str.length()-1);
			  String middle = str.substring(1, str.length()-1);
			  
			  strings[i] = lastChar + middle + firstChar;
		  }
		
		}
		
		for(String str : strings) {
			System.out.println("Printing Exchanged String :" + str);
		}
		
		
	}

}

package com.mvn.interview.prepartion.coding.prg;

public class StringFirstAndLastSwap {

	public static void main(String[] args) {
		
		 String[] strings = {"hello", "world", "java", "programming"};

	        // Swapping first and last characters of each string
	        for (int i = 0; i < strings.length; i++) {
	            String str = strings[i];

	            // If the string is empty or has only one character, no swap is needed
	            if (str != null && str.length() > 1) {
	                char firstChar = str.charAt(0);
	                char lastChar = str.charAt(str.length() - 1);
	                String middle = str.substring(1, str.length() - 1);
	                strings[i] = lastChar + middle + firstChar;
	            }
	        }

	        // Print the modified strings
	        for (String str : strings) {
	            System.out.println(str);
	        }

	}

}


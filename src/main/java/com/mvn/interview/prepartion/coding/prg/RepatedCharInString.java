package com.mvn.interview.prepartion.coding.prg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepatedCharInString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Input the string from the user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Convert the string to lower case to handle case insensitivity
        input = input.toLowerCase();

        // HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate over each character in the string
        for (char c : input.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        // Print characters that are repeated
        System.out.println("Repeated characters in the string are:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    
	}
	
}

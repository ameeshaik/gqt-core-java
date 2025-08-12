package com.gqt.corejava.Strings;

import java.util.Scanner;

public class VowelWithSpecialCharactertoallvowels {

	public static void main(String[] args) {
		 
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the string:");
		        String str = sc.nextLine();

		        StringBuilder result = new StringBuilder();
		        
		        int capital_vowel = 0;

		        for (int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);
		            	if (ch == 'A') {
		    				result.append('&');
		    				capital_vowel++;
		    			} else if (ch == 'E') {
		    				result.append('#');
		    				capital_vowel++;
		    			} else if (ch == 'I') {
		    				result.append('*');
		    				capital_vowel++;
		    			} else if (ch == 'O') {
		    				result.append('@');
		    				capital_vowel++;
		    			} else if (ch == 'U') {
		    				result.append('%');
		    				capital_vowel++;
		            } else {
		                result.append(ch);  // Append non-vowel characters as they are
		            }
		        }

		        System.out.println("Modified String = " + result.toString());
		        
		        System.out.println("Capital Vowels = " + capital_vowel);
		    }
		}

package com.gqt.corejava.StringsChallenges;
import java.util.Scanner;
public class TwoStringsAnagramsorNot {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        // Take input from user
		        System.out.print("Enter first string: ");
		        String str1 = sc.nextLine();

		        System.out.print("Enter second string: ");
		        String str2 = sc.nextLine();

		        // Remove spaces and convert both strings to lowercase
		        str1 = str1.replace(" ", "").toLowerCase();
		        str2 = str2.replace(" ", "").toLowerCase();

		        // First check: if lengths are not equal, not anagrams
		        if (str1.length() != str2.length()) {
		            System.out.println("Not Anagrams");
		            return;
		        }

		        // Check each character of str1 in str2
		        for (int i = 0; i < str1.length(); i++) {
		            char ch = str1.charAt(i);

		            // Check if str2 contains this character
		            if (str2.contains(String.valueOf(ch))) {
		                // Remove the first occurrence of that character from str2
		                int index = str2.indexOf(ch);
		                str2 = str2.substring(0, index) + str2.substring(index + 1);
		            } else {
		                // Character not found -> not an anagram
		                System.out.println("Not Anagrams");
		                return;
		            }
		        }

		        // All characters matched and removed
		        System.out.println("Strings are Anagrams");
		    }
		}


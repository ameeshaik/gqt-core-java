package com.gqt.corejava.StringsChallenges;
import java.util.Scanner;
public class OccuranceofCharacter {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // Input string
		        System.out.print("Enter a string: ");
		        String input = sc.nextLine();

		        // Input character to search
		        System.out.print("Enter the character to count: ");
		        char ch = sc.next().charAt(0);  // Read only one character

		        int count = 0;

		        // Loop to count occurrences
		        for (int i = 0; i < input.length(); i++) {
		            if (input.charAt(i) == ch) {
		                count++;
		            }
		        }

		        System.out.println("The character '" + ch + "' occurs " + count + " times.");
		    }
		}


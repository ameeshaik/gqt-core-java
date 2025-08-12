package com.gqt.corejava.StringsChallenges;

import java.util.Scanner;

public class LongestWordinaString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split the sentence into words using space
        String[] words = sentence.split(" ");

        // Assume the first word is the longest (for now)
        String longestWord = words[0];

        // Check each word in the array
        for (int i = 1; i < words.length; i++) {
            // If current word is longer than longestWord, update it
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        // Print the longest word and its length
        System.out.println("Longest word: " + longestWord);
        System.out.println("Length: " + longestWord.length());
    }
}
	

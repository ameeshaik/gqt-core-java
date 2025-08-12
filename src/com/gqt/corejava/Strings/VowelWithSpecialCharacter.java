package com.gqt.corejava.Strings;

import java.util.Scanner;

public class VowelWithSpecialCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();
        int small_vowel = 0;
        int capital_vowel = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                result.append('$');
                capital_vowel++;
            } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                result.append('$');
                small_vowel++;
            } else {
                result.append(ch);  // Append non-vowel characters as they are
            }
        }

        System.out.println("Modified String = " + result.toString());
        System.out.println("Small Vowels = " + small_vowel);
        System.out.println("Capital Vowels = " + capital_vowel);
    }
}




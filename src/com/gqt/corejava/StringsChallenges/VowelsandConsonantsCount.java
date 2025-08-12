package com.gqt.corejava.StringsChallenges;

import java.util.Scanner;

public class VowelsandConsonantsCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		int capital_vowel_count=0;
		int smaller_vowel_count=0;
		
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)>='A' && str.charAt(i)<='Z') || 
					(str.charAt(i)>='a' && str.charAt(i)<='z')) {
			if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || 
					str.charAt(i)=='O' || str.charAt(i)=='U' ) {
				capital_vowel_count++;
				}
				else if(str.charAt(i)=='a' || str.charAt(i)=='e' || 
						str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ) {
					 smaller_vowel_count++;
					
				}
			}
			
		}
		System.out.println(" smaller vowel Count="+ smaller_vowel_count);
		System.out.println(" capital vowel Count="+ capital_vowel_count);
	}

}

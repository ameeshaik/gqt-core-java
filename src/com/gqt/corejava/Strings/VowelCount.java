package com.gqt.corejava.Strings;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		int vowel_count=0;
		int cons_count=0;
		str=str.toUpperCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || 
						str.charAt(i)=='O' || str.charAt(i)=='U' ) {
					vowel_count++;
				}
				else {
					cons_count++;
					
				}
			}
			
		}
		System.out.println("Vowel Count="+ vowel_count);
		System.out.println("Consonant Count="+ cons_count);
	}

}

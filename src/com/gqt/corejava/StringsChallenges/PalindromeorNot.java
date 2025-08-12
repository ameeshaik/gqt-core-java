package com.gqt.corejava.StringsChallenges;

import java.util.Scanner;

public class PalindromeorNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			res=res+str.charAt(i);
		}
		System.out.println("the resultant string is = "+res);
		if(str.equals(res)==true) {
			System.out.println("palindrome");
		}
		else {
			System.out.println(" not palindrome");

		}
	}

}

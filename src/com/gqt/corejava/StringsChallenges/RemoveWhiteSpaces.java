package com.gqt.corejava.StringsChallenges;
import java.util.Scanner;
public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a string to replace");
		String str=sc.nextLine();
		String res=str.replaceAll("\\s", "");
		System.out.println("String without spaces:"+res);

	}

}

package com.gqt.corejava.StringsChallenges;
import java.util.Scanner;
public class LengthofString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		int len=str.length();
		System.out.println("length is "+len);
	}

}

package com.gqt.corejava.Strings;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		int sum=0;
		 for (int i = 0; i < str.length(); i++) {
	            sum=sum+str.charAt(i);
	}
	System.out.println("sum = "+sum);

}
}

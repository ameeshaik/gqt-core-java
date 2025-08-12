package com.gqt.corejava.Strings;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		int product=1;
		 for (int i = 0; i < str.length(); i++) {
	            product*=str.charAt(i);
	}
	System.out.println("product = "+product);

	}

}

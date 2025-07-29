package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern33 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		char c='A';
		for(int i=1;i<=n;i++) {          //to give spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*(i)-1;j++) {   //to print *
			System.out.print(c);
			System.out.print(" ");
		}
			c++;
			System.out.println();
		}
	}

}

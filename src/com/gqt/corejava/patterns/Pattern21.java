package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int count=n;
		for(int i=15;i>=n;i--) {
		for(int j=1;j<=n;j=j+1) {
			System.out.print(count+" ");
			count++;
		}
		System.out.println();

	}
	}
}

package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Newpattern28 {
//	@description this contains source code for the pattern W
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n-1) || i+j==(n-1) && i>j || i==j && i+j>=(n-1)|| j==(n-1)) 
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.println();
		}

	}

}

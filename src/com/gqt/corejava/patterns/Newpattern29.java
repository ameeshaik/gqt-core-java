package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Newpattern29 {
//	@description this contains source code for the pattern Y
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j || i+j==(n-1)) 
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

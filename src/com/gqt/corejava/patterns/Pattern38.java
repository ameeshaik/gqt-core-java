package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern38 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter the size");
		  int n=sc.nextInt();
		  char c='A';
		  for(int i=1;i<=n;i++) { 
				for(int j=1;j<=n-i;j++) {
					System.out.print("  ");
				}
				for(int j=i;j>=1;j--) {
					System.out.print((char)('A'+j-1)+" ");
					c++;
				}
                for(int j=2;j<=i;j++) {
                	System.out.print((char)('A'+j-1)+" ");
                }
                System.out.println();
		  }
	}

}

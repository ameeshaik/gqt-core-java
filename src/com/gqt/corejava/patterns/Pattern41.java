package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern41 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter the size");
		  int n=sc.nextInt();
		  for(int i=0;i<n;i++) { 
				for(int j=0;j<n-i-1;j++) {
					System.out.print("  ");
				}
				for(int j=i;j>=0;j--) {
					System.out.print(j+" ");
				}
              for(int j=1;j<=i;j++) {
              	System.out.print(j+" ");
              }
              System.out.println();
		  }
		  sc.close();
	}

}


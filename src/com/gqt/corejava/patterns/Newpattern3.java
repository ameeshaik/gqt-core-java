/**
 * 
 */
package com.gqt.corejava.patterns;
/*
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Newpattern3 {

	/**
	 * @param args
	 * description this contains source code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("- ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("$ ");
			}
			System.out.println();
			
			}
		}
	}



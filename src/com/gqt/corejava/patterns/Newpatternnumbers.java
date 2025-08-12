package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Newpatternnumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || i==0 || i==(n-1) || j==(n-1)) // 0 
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i+j==(n/2) || j==(n/2) || i==(n-1)) // 1
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==0 || j==(n-1) && i<=(n/2) || i==(n/2) || j==0 && i>=(n/2) || i==(n-1)) // 2
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==0 || j==(n-1) && i<=(n/2) || i==(n/2) || i==(n-1) || j==(n-1) && i>=(n/2)) // 3
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==(n/2) || j==(n/2) || j==0 && i<=(n/2)) // 4
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 && i<=(n/2) || i==(n/2) || j==(n-1) && i>=(n/2) || i==(n-1)) // 5
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==(n-1) || j==(n-1) && i>=(n/2) || i==(n/2)) // 6
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==0 ||  j==(n-1) ) // 7
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==0 ||  j==(n-1) || i==(n/2) || j==0 || i==(n-1) ) // 8
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==0 ||  j==(n-1)  || i==(n/2) || j==0 && i<=(n/2) )
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
			
	

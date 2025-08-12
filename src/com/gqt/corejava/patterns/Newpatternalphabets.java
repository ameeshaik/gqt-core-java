package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Newpatternalphabets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n-1) || i==0 || i==(n/2)) // A
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n-1) || i==0 || i==(n/2) || i==(n-1)) // B
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0 || i==0 || i==(n-1)) // C
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0 || i==0 || i==(n-1) || j==(n-1)) // D
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0 || i==0 || i==(n-1) || i==(n/2)) // E
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0 || i==0  || j==(3/4) || i==(n/2)) // F
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==(n-1) && j<=n/2 || j==(n/2) && i>=(n/2) || i==(n/2) 
						&& j>=(n/2) || j==(n-1) && i>=(n/2) ) // G
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n-1) || i==(n/2)) // H
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==0  || i==(n-1) || j==(n/2)) // I
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==0 || j==(n/2) || i==(n-1) && j<=(n/2) ) // J
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0  ||  j+i==(n/2) || i-j==(n/2)) // K
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0  ||  i==(n-1)) // L
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n-1) || i==j && i+j<=(n-1) || i+j==(n-1) && j>=i) // M
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0  ||  i==j || j==(n-1)) // N
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0 || i==0 || i==(n-1) || j==(n-1)) // O
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0 || i==0  || i==(n/2) || j==(n-1) && i<=n/2) // P
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0 || i==0 || i==(n-1) || j==(n-1) || i==j) // Q
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0 || i==0 || j==(n-1) &&  i<=(n/2) || i==(n/2) && j>=(n/2) || i==j && 
						i+j>=(n-1)) // R
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 && i<=(n/2) || i==(n/2) || j==(n-1) && i>=(n/2) || i==(n-1)) // S
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==0 || j==(n/2)) // T
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0 || i==(n-1) || j==(n-1)) // U
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i-j==(n/2) || i+j==(n-1)+(n/2) || j==0 && i<=(n/2) || j==n-1 && i<=(n/2)) // V
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n-1) || i+j==(n-1) && i>j || i==j && i+j>=(n-1)|| j==(n-1)) // W
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==j || i+j==(n-1)) // X
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==j && i+j<(n-1)|| i+j==(n-1) && j>i || j==(n/2) && i>=(n/2)) // Y
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==0 || i+j==(n-1)|| i==(n-1) ) // Z
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

			
			
	

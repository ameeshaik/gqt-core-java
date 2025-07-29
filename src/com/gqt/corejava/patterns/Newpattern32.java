
package com.gqt.corejava.patterns;

import java.util.Scanner;


public class Newpattern32 {

	/**
	 * @param args
	 *  @description this contains source code that print AMEENA
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n-1) || i==0 || i==(n/2)) //A
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
					if(j==0 || j==(n-1) || i==0 || i==(n/2)) // A
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

				
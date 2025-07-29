package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		        for (int i = 1; i <= n; i++) {
		            for (int j = 1; j <= n - i+1; j++) {
		                System.out.print("-");
		            }
		            for (int k = 1; k <= i; k++) {
		                System.out.print("#");
		            }

		            System.out.println(); 
		        }
		    }
		}

	

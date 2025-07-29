package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern37 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter the size");
		  int n=sc.nextInt();
		  int letterAscii=65;
		  for(int i=1;i<=n;i++) { 
				for(int j=1;j<=n-i;j++) {
					System.out.print("  ");
				}
	      for(int j=0;j<(2*i-1);j++) {
	    	  char ch=(char)(letterAscii-j);
	    	  if(ch>='A') {
	    	  System.out.print(ch+" ");
	      }
			  }
		  letterAscii+=2;
			  System.out.println();
		  }
		  sc.close();
	}
	}



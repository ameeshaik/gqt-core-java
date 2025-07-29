package com.gtq.corejava.staticsegment;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the byte data:");
		Byte b= sc.nextByte();
		System.out.println("the Byte data="+b);
		System.out.println("------");
		System.out.println("enter the short data:");
		Short s= sc.nextShort();
		System.out.println("the Short data="+s);
		System.out.println("------");
		System.out.println("enter the int data:");
		int i= sc.nextInt();
		System.out.println("the int data="+i);
		System.out.println("------");
		System.out.println("enter the long data:");
		Long l= sc.nextLong();
		System.out.println("the long data="+l);
		System.out.println("------");
		System.out.println("enter the float data:");
		Float f= sc.nextFloat();
		System.out.println("the float data="+f);
		System.out.println("------");
		System.out.println("enter the double data:");
		double d= sc.nextDouble();
		System.out.println("the double data="+d);
		System.out.println("------");
		sc.nextLine();
		System.out.println("enter the string:");
		String str= sc.nextLine();
		System.out.println("the string data="+str);
		sc.close();
	}
}



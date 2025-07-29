package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Arraycode1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the student count:");
		int n=sc.nextInt();
		// creating the array to store n students marks 
		int arr[]=new int[n];
		//collecting & storing marks of n students
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the marks of students no:"+(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("--------");
		//display marks stored inside the array 
		for(int i=0;i<arr.length;i++) {
			System.out.println("the marks of student no:"+(i+1)+"is" +arr[i]);
		}
	}
}
		



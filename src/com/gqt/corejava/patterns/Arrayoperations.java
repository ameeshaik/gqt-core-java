package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Arrayoperations {

	public static void main(String[] args) {
		Arraycode2 ao=new Arraycode2();
		ao.creatarray();
		ao.collectData();
		ao.displayData();
	}
}
	class Arraycode2{
			int arr[];
			Scanner sc=new Scanner(System.in);
			void creatarray() {
				System.out.println("enter the student count:");
				int n=sc.nextInt();
				// creating the array to store n students marks 
				 arr=new int[n];
				 System.out.println("array created");
				 System.out.println("--------");
			}
			void collectData() {
				for(int i=0;i<arr.length;i++) {
					System.out.println("enter the marks of students no:"+(i+1));
					arr[i]=sc.nextInt();
			}
				 System.out.println("Data stored into the memory");
		}
			void displayData() {
				for(int i=0;i<arr.length;i++) {
					System.out.println("the marks of student no:"+(i+1)+"is" +arr[i]);
				}

		}
			
		}
			
		

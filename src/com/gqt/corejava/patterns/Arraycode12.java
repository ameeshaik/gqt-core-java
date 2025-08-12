package com.gqt.corejava.patterns;
import java.util.Scanner;
class Arrayoperationsnew8{
String arr[][][];
Scanner sc=new Scanner(System.in);
void createArray() {
	System.out.println("enter the  school count:");
	int slc=sc.nextInt();
	
	
	// creating the 3D array
		arr=new String[slc][][]; 
		
		// creating class count
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter class count inside students no:"+(i+1));
			arr[i]=new String[sc.nextInt()][];	
		}
		
		// collecting student count
         for(int i=0;i<arr.length;i++) {
        	 System.out.println("inside class :"+(i+1));
        	 for(int j=0;j<arr[i].length;j++) {
        		 System.out.println("enter the student count inside class no:"+(j+1));
        	 arr[i][j]=new String[sc.nextInt()];
         }
}


	System.out.println("Array is created:");
	 System.out.println("--------");
}

	
void collectData() {
	for(int i=0;i<arr.length;i++) {
		System.out.println("inside  the school no:"+(i+1));
		for(int j=0;j<arr[i].length;j++){
			System.out.println("inside the class  no:"+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("enter the marks of student  no:"+(k+1));
			arr[i][j][k]=sc.next();
		}
	}
	}
		System.out.println("Data collected");
		 System.out.println("--------");
		}

		void displayData() {

			for(int i=0;i<arr.length;i++) {
				System.out.println("inside school no:"+(i+1));
				for(int j=0;j<arr[i].length;j++){
					System.out.println("inside class no:"+(j+1));
					for(int k=0;k<arr[i][j].length;k++) {
						System.out.println(" enter the marks of student no:"+(k+1)+" is ="+arr[i][j][k]);
				}
			}
			}
				System.out.println("--------");
	}
}

public class Arraycode12 {

	public static void main(String[] args) {
		Arrayoperationsnew8 ao=new Arrayoperationsnew8();
		ao.createArray();
		ao.collectData();
		ao.displayData();
	}
		
}


		
		
	

		


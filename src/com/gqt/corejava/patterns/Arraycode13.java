package com.gqt.corejava.patterns;
import java.util.Scanner;
class Arrayoperationsnew13{
String arr[][][];
Scanner sc=new Scanner(System.in);
void createArray() {
	System.out.println("enter the  bank count:");
	int ban=sc.nextInt();
	
	
	// creating the 3D array
		arr=new String[ban][][]; 
		
		// creating branch count
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter branch count inside bank no:"+(i+1));
			arr[i]=new String[sc.nextInt()][];	
		}
		
		// collecting customer count
         for(int i=0;i<arr.length;i++) {
        	 System.out.println("inside class :"+(i+1));
        	 for(int j=0;j<arr[i].length;j++) {
        		 System.out.println("enter the customer count inside branch no:"+(j+1));
        	 arr[i][j]=new String[sc.nextInt()];
         }
}


	System.out.println("Array is created:");
	 System.out.println("--------");
}

	
void collectData() {
	for(int i=0;i<arr.length;i++) {
		System.out.println("inside  the bank no:"+(i+1));
		for(int j=0;j<arr[i].length;j++){
			System.out.println("inside the branch  no:"+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("enter the data of bank  no:"+(k+1));
			arr[i][j][k]=sc.next();
		}
	}
	}
		System.out.println("Data collected");
		 System.out.println("--------");
		}

		void displayData() {

			for(int i=0;i<arr.length;i++) {
				System.out.println("inside bank no:"+(i+1));
				for(int j=0;j<arr[i].length;j++){
					System.out.println("inside branch no:"+(j+1));
					for(int k=0;k<arr[i][j].length;k++) {
						System.out.println(" enter the data of bank no:"+(k+1)+" is ="+arr[i][j][k]);
				}
			}
			}
				System.out.println("--------");
	}
}

public class Arraycode13 {

	public static void main(String[] args) {
		Arrayoperationsnew13 ao=new Arrayoperationsnew13();
		ao.createArray();
		ao.collectData();
		ao.displayData();
	}
		
}




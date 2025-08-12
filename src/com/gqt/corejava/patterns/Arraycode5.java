package com.gqt.corejava.patterns;
import java.util.Scanner;
class Arrayoperationsnew2{
	String arr[][][];
	Scanner sc=new Scanner(System.in);
	void createArray() {
		System.out.println("enter the school count:");
		int slc=sc.nextInt();
		System.out.println("enter the class count in each school:");
		int cls=sc.nextInt();
		System.out.println("enter the student count in each class:");
		int stu=sc.nextInt();
			arr=new String[slc][cls][stu]; // creating the 3D array
		System.out.println("Array is created:");
		 System.out.println("--------");
	}
		
	void collectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside  the school no:"+(i+1));
			for(int j=0;j<arr[i].length;j++){
				System.out.println("enter the class  no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter the   name of student  no:"+(k+1));
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
							System.out.println(" the name of student no:"+(k+1)+" is ="+arr[i][j][k]);
					}
				}
				}
					System.out.println("--------");
		}
	}

public class Arraycode5 {

	public static void main(String[] args) {
		Arrayoperationsnew2 ao=new Arrayoperationsnew2();
		ao.createArray();
		ao.collectData();
		ao.displayData();
	}
		
}


		
		
	
